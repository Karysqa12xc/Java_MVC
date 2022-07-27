package Xu_Ly_Chuoi_P1;

import java.util.Scanner;

public class Lay_do_dai_va_ki_tu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		
		System.out.println("Hiển thị chuỗi vừa nhập");
		System.out.println("----------");
		//Hàm lenght(): lấy được độ dài của chuỗi ***
		System.out.println("Độ dài của chuỗi vừa nhập là: " + s.length());
		//Hàm charAt(vị trí): Lấy ra một ký tự tại vị trí ***
		int doDai = s.length();
		for(int i = 0; i < doDai; i++) {
			System.out.println("Vị trí " + i + " là: " + s.charAt(i));
		}
		
		//Hàm getChars(vị trí bắt đầu, vị trí kết thúc - 1, 
		//mảng lưu giữ liệu, vị trí bắt đầu lưu của mảng): Lấy hàng loạt các ký tự
		char[] arr = new char[100];
		s.getChars(2, 10, arr, 0);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Giá trị của mảng tại " + i + " là: " + arr[i]);
		}
		//Hàm getBytes() => lấy ra giá trị  ASCII của các ký tự trong một mảng
		//Cách 1:
		byte []arr1 = s.getBytes();
		for(byte b : arr1) {
			System.out.println(b);
		}
	}
}
