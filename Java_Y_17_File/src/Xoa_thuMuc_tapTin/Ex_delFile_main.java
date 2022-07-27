package Xoa_thuMuc_tapTin;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


//delete(): Xóa tập tin
//deleteOnExit(): Xóa khi thư mục đó rỗng
public class Ex_delFile_main {
	public static void xoaFile(File f) {
		if(f.isFile()) {
			System.out.println("Đã xóa: " + f.getAbsolutePath());
			f.delete();//Xóa file nếu là tập tin
		}else if(f.isDirectory()) {
			File mang[] = f.listFiles();
			for (File file : mang) {
				//Xóa file con
				xoaFile(file);
			}
			//Xóa thư mục sau khi đã xóa các tệp con
			System.out.println("Đã xóa: " + f.getAbsolutePath());
			f.delete();
		}
	}
	
	
	public static void main(String[] args) {
		//Sử dụng class File để xóa tập tin và thư mục
		File f0 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Vidu1.txt");
		File f1 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\abc.doc");
		File f2 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2");
		File f3 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2\\Directory_3");
		
		Ex_delFile_main.xoaFile(f3);
		
		//Sử dụng class Files để xóa tập tin và thư mục
		Path p = f2.toPath();
		try {
			Files.deleteIfExists(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
