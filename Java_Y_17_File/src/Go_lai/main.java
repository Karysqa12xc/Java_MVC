package Go_lai;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;



public class main {
	File f;
	public main(String f) {
		this.f = new File(f);
	}
	
	public boolean checkExcute() {
		return this.f.canExecute();
	}
	
	public boolean checkRead() {
		return this.f.canRead();
	}
	public boolean checkWrite() {
		return this.f.canWrite();
	}
	public String AbsolutePath() {
		return this.f.getAbsolutePath();
	}
	public String nameFile() {
		return this.f.getName();
	}
	public void File_What() {
		if(this.f.isDirectory()) {
			System.out.println("Đây là một thư mục");
		}else {
			System.out.println("Đây là File");
		}
	}
	
	public void File_con() {
		File mang[] = this.f.listFiles();
		for (File file : mang) {
			System.out.println(file.getName());
		}
	}
	
	public void printTree() {
		this.paintTree(this.f, 1);
	}
	
	public void paintTree(File f, int bac) {
		for(int i = 0; i < bac ; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if(f.canRead() && f.isDirectory()) {
			File mangp[] = f.listFiles();
			for (File file : mangp) {
				this.paintTree(file, bac + 1);
			}
		}
		
	}
	
	public static void xoaThuMucChuaFile(File f) {
		if(f.isFile()) {
			System.out.println("File được xóa là: " + f.getAbsolutePath());
			f.delete();
		}
		else if(f.isDirectory()) {
			File mang[] = f.listFiles();
			for (File file : mang) {
				xoaThuMucChuaFile(file);
			}
			System.out.println("Sau khi xóa thư mục con ta được: " + f.getAbsolutePath());
			f.delete();
		}
	}
	public static void main(String[] args) {
		File f2 = new File("C:\\Users\\admin\\eclipse-workspace\\Java_Y_17_File\\Directory_1\\Directory_2");
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		String f;
		System.out.println("Nhập đường dẫn: ");
		f = sc.nextLine();
		main m = new main(f);
		do {
			System.out.println("Menu-------------");
			System.out.println("1. Kiểm tra file có thể thực thi không");
			System.out.println("2. Kiểm tra file có thể đọc dữ liệu không");
			System.out.println("3. Kiểm tra file có thể ghi dữ liệu không");
			System.out.println("4. In đường dẫn");
			System.out.println("5. In tên file");
			System.out.println("6. Kiểm tra File có phải là thư mục không");
			System.out.println("7. In ra danh sách các File con");
			System.out.println("8. In ra cây thư mục");
			System.out.println("9. Xóa một thư mục chứa một File");
			System.out.println("0. Thoát chương trình");
			System.out.println("Nhập lựa chọn của bạn: ");
			luaChon = sc.nextInt(); sc.nextLine();
			switch(luaChon) {
			case 1:
				System.out.println("File này có thể thực thi không: ");
				if(m.checkExcute() == true)  System.out.println("Có thể thực thi");
				else System.out.println("Không thể thực thi");
				break;
			case 2:
				System.out.println("File này có thể đọc được dữ liệu không: ");
				if(m.checkRead() == true) System.out.println("File có thể đọc được dữ liệu");
				else System.out.println("File không thể đọc được dữ liệu");
				break;
			case 3:
				System.out.println("File này có thể ghi được dữ liệu không: ");
				if(m.checkWrite()== true) System.out.println("File có thể ghi được dữ liệu");
				else System.out.println("File không thể ghi được dữ liệu");
				break;
			case 4:
				System.out.println("Đường dẫn của File cần in là: " + m.AbsolutePath() );
				break;
			case 5:
				System.out.println("Tên file là: " + m.nameFile());
				break;
			case 6:
				m.File_What();
				break;
			case 7:
				m.File_con();
				break;
				
			case 8:
				m.printTree();
				break;
			case 9: 
				m.xoaThuMucChuaFile(f2);
				break;
			}
			
			
		} while (luaChon != 0);

	}
}
