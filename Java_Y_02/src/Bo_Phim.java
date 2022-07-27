
public class Bo_Phim {
	private String tenPhim;
	private int namSanXuat;
	private Hang_San_Xuat hangSanXuat;
	private double giaVe;
	private Ngay_chieu ngayChieu;
	public Bo_Phim(String tenPhim, int namSanXuat, Hang_San_Xuat hangSanXuat, double giaVe, Ngay_chieu ngayChieu) {
		
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	
	public boolean So_Sanh_Gia_Ve(Bo_Phim phimKhac) {
		return giaVe == phimKhac.giaVe; 
	}

	public double gia_Ve_Khuyen_Mai(double x) {
		return this.giaVe * (1 - x/100);
	}
	public String ten_Hang_San_Xuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public Hang_San_Xuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(Hang_San_Xuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay_chieu getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Ngay_chieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	
		
	
	
}
