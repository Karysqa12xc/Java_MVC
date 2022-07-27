package docDuLieu;

import java.io.BufferedReader;//class dùng để đọc dữ liệu

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//Bài 72: Đọc dữ liệu từ một File
public class Ex_reader_main {
	public static void main(String[] args) {
		//Cách 1:
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2\\Vidu3.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true) {
				line = br.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Cách 2:
		/*File f2 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2\\Vidu3.txt");
		try {
			List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String string : allText) {
				System.out.println(string);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}
}
