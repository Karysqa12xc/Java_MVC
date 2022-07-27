package nen_giaiNen_tapTin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Ex_main_ZipFile {
	public static void main(String[] args) throws IOException {
		//nén một tập tin
		String sourceFile = "C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\src\\nen_giaiNen_tapTin\\"
				+ "test.txt";
		//nén nhiều tập tin thì dùng đổi String thành List<String>
			FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\src\\nen_giaiNen_tapTin\\test.zip");
			ZipOutputStream zipOut = new ZipOutputStream(fos);
			File fileToZip = new File(sourceFile);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEnTry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEnTry);
			byte[] bytes = new byte[1024];
			int lenght;
			while((lenght = fis.read(bytes))  >= 0) {
				zipOut.write(bytes, 0 ,lenght);
			}
			zipOut.close();
			fis.close();
			fos.close();
	}
}	
