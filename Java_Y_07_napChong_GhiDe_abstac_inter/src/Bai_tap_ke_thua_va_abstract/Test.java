package Bai_tap_ke_thua_va_abstract;

public class Test {
	public static void main(String[] args) {
		HangSanXuat s1 = new HangSanXuat("Hang 1", "Viet Nam");
		HangSanXuat s2 = new HangSanXuat("Hang 2", "Japan");
		HangSanXuat s3 = new HangSanXuat("Hang 3", "American");
		
		PhuongTienDiChuyen p1 = new MayBay(s1, "Xang e5");
		PhuongTienDiChuyen p2 = new XeOto(s2, "Dau cu khoai");
		PhuongTienDiChuyen p3 = new XeDap(s3);
		
		MayBay m1 = new MayBay(s3,"Xang huan rose");
		
		System.out.println("Lay ten hang san xuat");
		System.out.println("p1: " + p1.layTenHangSX());
		
		System.out.println("Lay ten quoc gia: ");
		System.out.println("p1: " + p1.layTenQuocGia());
		
		System.out.println("Bay dau");
		p2.khoiDong();
		
		System.out.println("Lay van toc: ");
		System.out.println("p1: " + p1.layVanToc());
		System.out.println("p2: " + p2.layVanToc());
		System.out.println("p3: " + p3.layVanToc());
		
		System.out.println("Cat canh: ");
		m1.catCanh();
		System.out.println("Ha canh: ");
		m1.haCanh();
		
		
		
		
	}
}
