package timKiem_sapXep_Mang;

import java.util.Arrays;

import timKiem_sapXep_Mang.Phuong_thuc_sanh_compareTo;
public class Code_2 {
	public static void main(String[] args) {
		Phuong_thuc_sanh_compareTo sv1 = new Phuong_thuc_sanh_compareTo(1,"Thanh", "Lớp 1", 9);
		Phuong_thuc_sanh_compareTo sv2 = new Phuong_thuc_sanh_compareTo(100, "Hoa", "Lớp 2", 8); 
		Phuong_thuc_sanh_compareTo sv3 = new Phuong_thuc_sanh_compareTo(199, "An", "Lop 1", 8);
		
		
		
		Phuong_thuc_sanh_compareTo a_sv[] = new Phuong_thuc_sanh_compareTo[]{sv1, sv2, sv3};
		
		System.out.println("Ban đầu: " + Arrays.toString(a_sv));
		
		//Hàm xắp sếp đối tượng theo compareto
		Arrays.sort(a_sv);
		System.out.println("a_sv sau khi sắp xếp: " + Arrays.toString(a_sv));
		
		//Hàm tìm kiếm đối tượng 
		System.out.println("Tìm kiếm thanh niên tên Hoa ở ví trí: " + Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm kiếm thanh niên tên An ở vị trí: " + Arrays.binarySearch(a_sv, sv3));
	}
}
