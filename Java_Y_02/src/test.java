
public class test {
	public static void main(String[] args) {
		Ngay_chieu ngay1 = new Ngay_chieu(15, 02, 2021);
		Ngay_chieu ngay2 = new Ngay_chieu(7, 8, 2002);
		Ngay_chieu ngay3 = new Ngay_chieu(9, 10, 2022);
		
		Hang_San_Xuat hsx1 = new Hang_San_Xuat("Maver ", "America");
		Hang_San_Xuat hsx2 = new Hang_San_Xuat("Wanner bros", "Amrica");
		Hang_San_Xuat hsx3 = new Hang_San_Xuat("Mappa", "Japan");
		
		Bo_Phim phim1 = new Bo_Phim("Spiderman", 2022, hsx1, 150000, ngay1);
		Bo_Phim phim2 = new Bo_Phim("Batman", 2014, hsx2, 450000, ngay2);
		Bo_Phim phim3 = new Bo_Phim("SuperMan", 2022, hsx3, 150000, ngay3);
		
		System.out.println("Ten hang san xuat cua bo phim 3: " + phim3.ten_Hang_San_Xuat());
		
		System.out.println("So sanh gia ve phim 1 va 3: " + phim1.So_Sanh_Gia_Ve(phim3));
		System.out.println("So sanh gia ve phim 1 va 2: " + phim1.So_Sanh_Gia_Ve(phim2));
		
		System.out.println("Gia ve sau khi giam 10 cua phim 1: " + phim1.gia_Ve_Khuyen_Mai(10));
		System.out.println("Gia ve sau khi giam 20 cua phim 2: " + phim2.gia_Ve_Khuyen_Mai(20));
		System.out.println("Gia ve sau khi giam 30 cua phim 3: " + phim3.gia_Ve_Khuyen_Mai(50));
		
	}
}
