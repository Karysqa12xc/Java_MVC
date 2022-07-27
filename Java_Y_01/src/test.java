
public class test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2021);
		Ngay ngay2 = new Ngay(25, 9, 2030);
		Ngay ngay3 = new Ngay(15, 9, 2025);

		Tac_Gia tacgia1 = new Tac_Gia("Nam1", ngay1);
		Tac_Gia tacgia2 = new Tac_Gia("Kimochi", ngay2);
		Tac_Gia tacgia3 = new Tac_Gia("Nam2", ngay3);

		Sach sach1 = new Sach("Lap trinh C", 2023, tacgia1, 5000);
		Sach sach2 = new Sach("Lap trinh Java", 2023, tacgia2, 10000);
		Sach sach3 = new Sach("Lap trinh Python", 2025, tacgia3, 150000);

		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();

		System.out.println("So Sanh sach 1 va 2: " + sach1.kiemTraCungNam(sach2));
		System.out.println("So Sanh sach 1 va 3: " + sach1.kiemTraCungNam(sach3));

		System.out.println("Sach 1 giam 10% = " + sach1.giaSauKhiGiam(10));
		System.out.println("Sach 1 giam 10% = " + sach2.giaSauKhiGiam(20));
		System.out.println("Sach 1 giam 10% = " + sach3.giaSauKhiGiam(50));
	}
}
