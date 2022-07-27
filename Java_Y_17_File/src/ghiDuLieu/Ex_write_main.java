package ghiDuLieu;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

//Bài 71: Ghi dữ liệu
public class Ex_write_main {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(
					"C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2\\Vidu3.txt",
					"UTF-8");
			pw.println("Xin chào mình là Nam");
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.print(' ');
			pw.print("Là số Pi");
			pw.println();

			Student st = new Student(100, "Nguyễn Văn A");
			pw.println(st);
			pw.flush();// Bắt buộc phải gọi hàm này
			pw.close();// Bắt buộc phải gọi hàm này
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
