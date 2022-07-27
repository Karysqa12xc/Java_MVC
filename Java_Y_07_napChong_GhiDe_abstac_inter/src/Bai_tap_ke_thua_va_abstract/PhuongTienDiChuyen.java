package Bai_tap_ke_thua_va_abstract;

public abstract class PhuongTienDiChuyen{
	protected String loaiPhuongTien;
	protected HangSanXuat tenHangSanXuat;

	

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat tenHangSanXuat) {
		super();
		this.loaiPhuongTien = loaiPhuongTien;
		this.tenHangSanXuat = tenHangSanXuat;
	}

	
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}


	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}


	public HangSanXuat getTenHangSanXuat() {
		return tenHangSanXuat;
	}


	public void setTenHangSanXuat(HangSanXuat tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String layTenHangSX() {
		return this.tenHangSanXuat.getTenHangSanXuat();
	}
	
	public String layTenQuocGia() {
		return this.tenHangSanXuat.getTenQuocGia();
	}
	public void khoiDong() {
		System.out.println("No may>>>>");
	}
	
	public void TangToc() {
		System.out.println("Di chuyen toc do 10 - 30 - 50 km");
	}
	
	public void tatMay() {
		System.out.println("Da ve den nha");
	}
	
	abstract double layVanToc();
	
}
//3:11
