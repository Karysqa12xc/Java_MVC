package Array_list;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

/*Những thứ cần nhớ trong arraylist
 * thêm vào arraylist ta dùng add
 * In các phần từ trong arraylist ta dùng foreach
 * Kiểm tra xem trong arraylist có rồng không ta dùng isEmpty
 * Lấy số lượng phân từ trong arraylist ta dùng size
 * Làm rỗng arraylist ta dùng clear or removeALL(o)
 * Kiểm tra một phần tử liệu có trong arraylist không ta dung contains
 * Xóa một phần tử trong arraylist ta dùng remove
 * */

public class ArrayList_QuanLySinhVien {

	private ArrayList<Sinh_Vien> sv = new ArrayList<>();

	public ArrayList_QuanLySinhVien() {
		this.sv = new ArrayList<Sinh_Vien>();
	}

	public ArrayList_QuanLySinhVien(ArrayList<Sinh_Vien> sv) {
		this.sv = sv;
	}

//1. Thêm sinh viên vòa danh sách
	public void themSinhVien(Sinh_Vien sv1) {
		sv.add(sv1);
	}

//2. In danh sách sinh viên
	public void xuatDanhSach() {
		for (Sinh_Vien sinh_Vien : sv) {
			System.out.println(sinh_Vien);
		}
	}

//3. Kiểm tra danh sách sinh viên có rỗng không
	public boolean kiemTraDanhSach() {
		return sv.isEmpty();
	}

//4. Lấy ra số lượng sinh viên trong danh sách
	public int soLuongSinhVien() {
		return sv.size();
	}

//5.Làm rỗng danh sách sinh viên
	public void lamRong() {
		sv.clear();
		// sv.removeAll(sv);
	}

//6.Kiểm tra sinh viên có tồn tại trong danh sách không bằng mã sinh viên
	public boolean sinhVienTonTai(Sinh_Vien sv1) {
		return sv.contains(sv1);
	}

//7. Xóa sinh viên ra khỏi danh sách dựa vào mã sinh viên
	public boolean xoaSinhVien(Sinh_Vien sv1) {
		return sv.remove(sv1);
	}

//8.Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím
	public void timSinhViem(String ten) {
		for (Sinh_Vien sinh_Vien : sv) {
			if (sinh_Vien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinh_Vien);
			}
		}
	}

//9/ Sắp xếp danh sách sinh viên từ thấp đến cao
	public void Sort_SV() {
		Collections.sort(sv, new Comparator<Sinh_Vien>() {
			@Override
			public int compare(Sinh_Vien o1, Sinh_Vien o2) {
				if (o1.getDTB() < o2.getDTB()) {
					return -1;
				} else if (o1.getDTB() < o2.getDTB()) {
					return 1;
				} else {
					return 0;
				}

			}
		});
	}
}
