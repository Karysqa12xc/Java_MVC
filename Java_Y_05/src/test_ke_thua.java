
public class test_ke_thua {
	public static void main(String[] args) {
		System.out.println("Kiểm tra");
		ConNguoi cn = new ConNguoi("Nam", 2002);
//		cn.an();
//		cn.uong();
//		cn.ngu();
		
		HocSInh hs = new HocSInh("Tan", 2022, "Lop 12", "truong 1");
		hs.an();
		hs.ngu();
		hs.uong();
		hs.lamBaiTap();

	
	}
}
