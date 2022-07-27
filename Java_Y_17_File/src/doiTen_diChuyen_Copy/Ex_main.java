package doiTen_diChuyen_Copy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

//Bài 70: Cách đổi tên và di chuyển File
//renameTo(): Đổi tên thư mục
//move(): Di chuyển File từ vị trí A sang File B 
//copy(): Copy từ File ban đàu sang một File mới

//Cách để copy toàn bộ dữ liệu bên trong

public class Ex_main {
	public static void copyAll(File f1, File f2) {
		try {//Copy cái vỏ bên ngoài
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f1.isDirectory()) {
			//Copy các tập tin và thư mục con
			File mang[] = f1.listFiles();
			for (File file : mang) {
				File file_new = new File(f2.getAbsoluteFile() + "/" + file.getName());
				copyAll(file, file_new);
			}
		}
		
	}

	public static void main(String[] args) {
		File f0 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\abc.doc");
		File f1 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Vidu3.txt");
		File f2 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Vidu3_xyz.txt");
		// 1. Thay đổi tên File hoặc thư mục
// Sử dụng File để đổi tên
//		f0.renameTo(f1);

		// Sử dụng Files để đổi tên
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 2.Di chuyển File
//		File f_2new = new File(
//				"C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2\\Vidu3_xyz.txt");
//		try {
//			Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 3. Copy File
		File f_0 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2");
		File f_0_copy = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_3");
		// Không copy được toàn bộ dự liệu bên trong
//		try {
//			Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Ex_main.copyAll(f_0, f_0_copy);
		

	}
}
