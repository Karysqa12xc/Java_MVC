package luuVaDocDoiTuongTuFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;

public class docDoiTuong {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\src\\luuVaDocDoiTuongTuFile\\file.data");
		try {
			InputStream is = new FileInputStream(f);
			try {
				ObjectInputStream ois = new ObjectInputStream(is);
				try {
					Sinh_Vien sv = (Sinh_Vien) ois.readObject();
					System.out.println(sv.getDTB());
					System.out.println(sv);
					ois.close();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
