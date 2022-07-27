
public class test_quan_ly_may_tinh {
	public static void main(String[] args) {
		Ngay_San_Xuat ngay1 = new Ngay_San_Xuat(15, 2, 2022);
		Ngay_San_Xuat ngay2 = new Ngay_San_Xuat(21,3,2022);
		Ngay_San_Xuat ngay3 = new Ngay_San_Xuat(15,2, 2022);
		
		Quoc_gia QG1 = new Quoc_gia("JP", "Japan");
		Quoc_gia QG2 = new Quoc_gia("KO", "Korean");
		Quoc_gia QG3 = new Quoc_gia("VN", "VietNam");
		
		Hang_San_Xuat hang1 = new Hang_San_Xuat("SamSung", QG1);
		Hang_San_Xuat hang2 = new Hang_San_Xuat("LG", QG2);
		Hang_San_Xuat hang3 = new Hang_San_Xuat("VinPC", QG3);
		
		May_tinh may1 = new May_tinh(hang1, ngay1, 100000, 12);
		May_tinh may2 = new May_tinh(hang2, ngay2, 60000, 24);
		May_tinh may3 = new May_tinh(hang3, ngay3, 5000000, 12); 
		
		System.out.println("Kiểm tra giá bán máy 1 và máy 2: " + may1.kiemTraGia(may2));
		System.out.println("Kiểm tra giá bán máy 1 và máy 3 " + may1.kiemTraGia(may3));
		
		System.out.println("Tên quốc gia cua từng máy: ");
		System.out.println("Máy 1: " + may1.layTenQuocGia());
		System.out.println("Máy 2: " + may2.layTenQuocGia());
		System.out.println("Máy 3: " + may3.layTenQuocGia());
		
	}
}
