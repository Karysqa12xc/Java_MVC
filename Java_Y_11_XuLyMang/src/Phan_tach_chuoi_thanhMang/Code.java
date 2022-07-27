package Phan_tach_chuoi_thanhMang;

import java.util.Arrays;

public class Code {
	public static void main(String[] args) {
		String s = "Xin chào các, bạn tui là Lỗ Tấn";
		//Cắt chuỗi thành mảng
		String a[] = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String b[] = s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chào, mình bị trĩ. Mình là Tấn lỗ";
		//Cách tách khi có hai key 
		String c[] = s2.split("\\,|\\.");
		System.out.println(Arrays.toString(c));
		
		//Cách lấy Tên, Họ, Họ đệm
		String s3 = "Nguyen Van A";
		String []d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		
		System.out.println("Họ: "+ d[0]);
	}
}
