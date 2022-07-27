
public class test_quan_ly_sv {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(7, 8, 2002);
		Ngay ngay2 = new Ngay(30,2,2002);
		Ngay ngay3 = new Ngay(7,8,2002);
		
		Lop lop1 = new Lop("10A1", "Khoa cong nghe thong tin");
		Lop lop2 = new Lop("10A2","Khoa mang may tinh");
		Lop lop3 = new Lop("10A3", "Khoa dao duong");
		
		Sinh_vien sv = new Sinh_vien("2021050461", "Nam", 8.0, ngay1,lop1);
		Sinh_vien sv1 = new Sinh_vien("2021050961", "Tan", 9.0, ngay2, lop2);
		Sinh_vien sv2 = new Sinh_vien("202105952", "Duong", 4.0, ngay3, lop3);
		
		
		System.out.println("Ten khoa: ");
		System.out.println("SV: " + sv.layTenKhoa());
		System.out.println("SV1: " + sv1.layTenKhoa());
		System.out.println("SV2: "  + sv2.layTenKhoa());
		
		System.out.println("Kiem tra sinh vien co thi dat hay khong: ");
		System.out.println("SV: " + sv.kiemTraSinhVienCoDau());
		System.out.println("SV1: " + sv1.kiemTraSinhVienCoDau());
		System.out.println("SV2: "  + sv2.kiemTraSinhVienCoDau());
		
		System.out.println("So sanh ngay sinh hai sinh vien xem co trung ngay sinh khong ");
		System.out.println(sv.kiemTraTrungNgaySinh(sv2));
		System.out.println(sv.kiemTraTrungNgaySinh(sv1));
		
	}
}
