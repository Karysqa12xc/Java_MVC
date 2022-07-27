package Thao_tac_file;

import java.io.File;
import java.io.IOException;

//Các hàm trong File cần nhớ
//1. exists() : Kiểm tra tập tin có tồn tại trong bộ nhớ không
//2. createNewFile(): Tạo ra một tập tin mới cụ thể 
//3. mkdir(): Tạo ra một Folder(thư mục)
//4. mkdirs(): Tạo hàng loạt Folder(thư mục)
//Lưu ý: Trên Ms window sử dụng: \ => \\ ví dụ: "C:\\Thư mục 1"

//Bài 67
public class Ex_File {
	public static void main(String[] args) {
		File folder1 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File");
		//Kiểm tra thư mục có tồn tại không
		System.out.println("Kiểm tra thư mục Java.txt có tồn tại không: " + folder1.exists());
		//Tạo thư mục
		//Phương thức mkdir()=>Tạo một thư mục
		File folder2 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1");
		folder2.mkdir();
		
		//Phương thức mkdirs()=>Tạo nhiều thư mục cùng lúc 
		File folder3 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2\\Directory_3");
		folder3.mkdirs();
		
//		Tạo tập tin(có phần mở rộng: .exe, .doc, .xls);
		File file1 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Vidu1.txt");
		File file2 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Vidu2.txt");
		try {
			file1.createNewFile();
			file2.createNewFile();
		} catch (IOException e) {
			//Không có quyền tạo tập tin
			//Ổ cứng đầy 
			//Đường dẫn bị sai
			e.printStackTrace();
		}
		
	}
	
}
