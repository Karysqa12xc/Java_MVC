package OverLoading_nap_chong_phuong_thuc;

public class test {
	public static void main(String[] args) {
		MyMath m1 = new MyMath();
		
		System.out.println("Tìm min của int: " + m1.timMin(7, 8));
		System.out.println("Tìm min của double: " + m1.timMin(7.0, 8.0));
		
		System.out.println("Tính tổng cuat double: " + m1.tinhTong(10.0, 10.0));
		double a[] = new double[] {1,2,3,4,5,6};
		System.out.println("Tính tổng mảng của double: " + m1.tinhTong(a));
		
		
	}
}
