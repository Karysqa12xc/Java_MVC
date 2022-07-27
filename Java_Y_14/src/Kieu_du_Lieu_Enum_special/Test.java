package Kieu_du_Lieu_Enum_special;

public class Test {
	public static void main(String[] args) {
		Thoi_khoa_bieu t1 = new Thoi_khoa_bieu(Day.Monday,Sex.Nam ,"Toán");
		Thoi_khoa_bieu t2 = new Thoi_khoa_bieu(Day.Tuesday, Sex.Nữ,"Thể dục");
		Thoi_khoa_bieu t3 = new Thoi_khoa_bieu(Day.Wednesday, Sex.Nữ ,"Văn");
		Thoi_khoa_bieu t4 = new Thoi_khoa_bieu(Day.Thursday, Sex.Nam,"Lý");
		Thoi_khoa_bieu t5 = new Thoi_khoa_bieu(Day.Friday, Sex.Nam,"Hóa");
		Thoi_khoa_bieu t6 = new Thoi_khoa_bieu(Day.Saturday, Sex.Nam,"Sinh");
		Thoi_khoa_bieu t7 = new Thoi_khoa_bieu(Day.Sunday, Sex.Nam,",Nghỉ");
		
		int x = Thang.Tháng_một.soNgay();
		System.out.println(x);
	}
}
