package Bai_tap;
/*Tìm ký tự chỉ xuất hiện một lần trong chuỗi, 
 *nếu có nhiều hơn một thì xuất ra màn hình vị trí của ký tự.
 *Nếu không có ký tự nào unique xuất ra “NO”.*/

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class Character_unique {
	public static void main(String[] args) {
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi 1: ");
		s1 = sc.nextLine();
		String s2 = s1.toLowerCase();
		String s3 = s2.trim();
		Search_first(s3);
	}
	public static void Search_first(String s1) {
		String t2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi 2: ");
		t2 = sc.nextLine();
		int count = 0;
		String t3 = t2.toLowerCase();
		int dodai = s1.length();
		int dodai1 = t3.length();
		char a1[] = new char[dodai];
		char a[] = new char[dodai1];
		s1.getChars(0, dodai, a1, 0);
		t3.getChars(0, dodai1, a, 0);
		for(int i = 0; i < dodai; i++) {
			for(int j = 0; j < dodai1; j++) {
				if(a1[i] == a[j]) {
					count++;
					break;
				}
			}
		}
		if(count == 1) {
			System.out.println("Ký tự trong s2 chỉ xuất hiện một lần duy nhất");
		}else if(count > 1) {
			System.out.println(a1[0]);
		}else {
			System.out.println("NO");
		}
		
	}
}
