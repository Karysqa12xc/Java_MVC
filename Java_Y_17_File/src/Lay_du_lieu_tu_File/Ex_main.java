package Lay_du_lieu_tu_File;


import java.io.File;
import java.util.Scanner;

//canExecute(): Kiểm tra xem file có thực thi được không
//canRead(): File có cho phép đọc dữ liệu không
//canWrite(): Có thể ghi dữ liệu vào trong File không
//getAbsolutePath(): Lấy ra đường dẫn của File
//getName(): Trả về tên của tập tin
//isDirectory(): Kiểm tra có phải thư mục không
//listFiles(): Duyệt thư mục

public class Ex_main extends Ex_layDuLieu{
	public Ex_main(String tenFile) {
		super(tenFile);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("Nhập tên File:  ");
		String File = sc.nextLine();
		Ex_layDuLieu rf = new Ex_layDuLieu(File);
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
			System.out.println("0. Thoát chương trình");
			luaChon = sc.nextInt(); sc.nextLine();
			switch(luaChon) {
				case 1:{
					System.out.println(rf.kiemTraThucThi());
					break;
				}
				case 2:{
					System.out.println(rf.kiemTraDoc());
					break;
				}
				case 3:{
					System.out.println(rf.kiemTraGhi());
					break;
				}
				case 4:{
					System.out.println(rf.traVeDuongDan());
					break;
				}
				case 5:{
					rf.InTen();
					break;
				}
				case 6:{
					rf.kiemTraFileLaGi();
					break;
				}
				case 7:{
					rf.inDanhSachFileCon();
					break;
				}
				case 8:{
					rf.inCayThuMuc();
					break;
				}
			}
		}while(luaChon != 0);
	}
}
