package luuVaDocDoiTuongTuFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ghiDoiTuong {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\src\\luuVaDocDoiTuongTuFile\\file.data");
			OutputStream os = new FileOutputStream(f);
			try {
				ObjectOutputStream oos = new ObjectOutputStream(os);
				Sinh_Vien sv = new Sinh_Vien("001", "Nam", 2000, 10.0);
				oos.writeObject(sv);
				oos.flush();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
