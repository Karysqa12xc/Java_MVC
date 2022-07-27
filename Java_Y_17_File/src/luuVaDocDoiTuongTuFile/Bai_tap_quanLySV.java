package luuVaDocDoiTuongTuFile;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicLabelUI;

import java.io.File;
import java.util.ArrayList;
//Bài 73+74:Lưu đối tượng vào File(Sử dụng ArrayList phần Java Collections) và Đọc đối tượng từ File
//Sử dụng class ObjectOuputStream và OutputStream, ObjectInputStream và InputStream
//Hàm quan trọng là: writeObject(), readObject

public class Bai_tap_quanLySV extends ArrayList_QuanLySinhVien {
	static void menu() {
		System.out.println("----MENU-----");
		System.out.println("1. Thêm sinh viên vòa danh sách " 
	+ "2. In danh sách sinh viên\n" 
	+ "3. Kiểm tra danh sách sinh viên có rỗng không\n"
	+ "4. Lấy ra số lượng sinh viên trong danh sách\n"
	+ "5. Làm rỗng danh sách sinh viên \n"
	+ "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không dựa vào mã sinh sinh viên\n"
	+ "7. Xóa một sinh viên kh�?i danh sách dựa trên ma sinh viên\n"
	+ "8. Tìm kiểm tất cả sinh viên dựa trên tên được nhập từ bàn phím\n"
	+ "9. Xuất ra màn hình sinh viên có điểm từ cao đến thấp\n"
	+ "10. Ghi dữ liệu sinh viên xuống File\n"
	+ "11. Đọc dữ liệu sinh viên từ File\n");
	}

	public static void main(String[] args) {
		int luaChon;
		Scanner sc = new Scanner(System.in);
		String Masv, hoVaTen;
		int namSinh;
		ArrayList_QuanLySinhVien ql1 = new ArrayList_QuanLySinhVien();
		double DTB;
		while (true) {
			menu();
			System.err.println("Nhập lựa ch�?n của bạn: ");
			luaChon = sc.nextInt(); sc.nextLine();
			switch (luaChon) {
			case 1: {
				System.out.println("Nhập mã sinh viên: ");
				Masv = sc.nextLine();
				System.out.println("Nhập h�? tên sinh viên: ");
				hoVaTen = sc.nextLine();
				do {
					System.out.println("Nhập năm sinh của sinh viên chỉ từ năm 2000 đến 2020: ");
					namSinh = sc.nextInt();
				} while (namSinh > 2020 || namSinh < 2000);
				System.out.println("Nhập điểm trung bình của sinh viên: ");
				DTB = sc.nextDouble();
				Sinh_Vien sv1 = new Sinh_Vien(Masv, hoVaTen, namSinh, DTB);
				ql1.themSinhVien(sv1);
				break;
			}
			case 2: {
				ql1.xuatDanhSach();
				break;
			}
			case 3: {
				System.out.println("Danh sách sinh viên hiện đanh");
				if (ql1.kiemTraDanhSach()) {
					System.err.println("Rỗng");
				} else {
					System.err.println("�?ã có sinh viên");
				}
				break;
			}
			case 4: {
				System.err.println("Số lượng sinh viên đang có trong danh sách là: "
						+ ql1.soLuongSinhVien());
				break;
			}
			case 5: {
				ql1.lamRong();
				break;
			}
			case 6: {
				System.out.println("Nhập mã sinh viên: "); Masv = sc.nextLine();
				Sinh_Vien sv2 = new Sinh_Vien(Masv);
				if (ql1.sinhVienTonTai(sv2)) {
					System.out.println("Sinh viên có tồn tại: ");
				} else {
					System.out.println("Sinh viên không tồn tại");
				}
				break;
			}
			case 7: {
				System.out.println("Nhập mã sinh viên: "); Masv = sc.nextLine();
				Sinh_Vien sv2 = new Sinh_Vien(Masv);
				ql1.xoaSinhVien(sv2);
				break;
			}
			case 8:{
				System.out.println("Nhập tên sinh viên: ");
				String ten; ten = sc.nextLine();
				ql1.timSinhViem(ten);
				break;
				
			}
			case 9:{
				ql1.Sort_SV();
				ql1.xuatDanhSach();
				break;
			}
			case 10:
				System.out.println("Nhập tên File: ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				ql1.writeObjFile(f);
				break;
			case 11:
				//Dữ liệu sẽ được ghi vào case 2 
				System.out.println("Nhâp đường dẫn File");
				String tenFile1 = sc.nextLine();
				File f1 = new File(tenFile1);
				ql1.docDoiTuong(f1);
				break;
			}
		}
	}
}
