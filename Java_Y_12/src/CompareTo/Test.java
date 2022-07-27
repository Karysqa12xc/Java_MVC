package CompareTo;

public class Test {
	public static void main(String[] args) {
		Phuong_thuc_sanh_compareTo sv1 = new Phuong_thuc_sanh_compareTo(1,"Thanh", "Lớp 1", 9);
		Phuong_thuc_sanh_compareTo sv2 = new Phuong_thuc_sanh_compareTo(100, "Hoa", "Lớp 2", 8);
		
		System.out.println(sv1.compareTo(sv2));
	}
}
