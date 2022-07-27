
public class Sinh_vien {
	private String mssv;
	private String ho_va_ten;
	private double diem_TB;
	private Ngay ngay_thang_nam_sinh;
	private Lop lopSV;
	
	
	
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getHo_va_ten() {
		return ho_va_ten;
	}
	public void setHo_va_ten(String ho_va_ten) {
		this.ho_va_ten = ho_va_ten;
	}
	public double getDiem_TB() {
		return diem_TB;
	}
	public void setDiem_TB(double diem_TB) {
		this.diem_TB = diem_TB;
	}
	public Ngay getNgay_thang_nam_sinh() {
		return ngay_thang_nam_sinh;
	}
	public void setNgay_thang_nam_sinh(Ngay ngay_thang_nam_sinh) {
		this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
	}
	public Lop getLopSV() {
		return lopSV;
	}
	public void setLopSV(Lop lopSV) {
		this.lopSV = lopSV;
	}
	
	public Sinh_vien(String mssv, String ho_va_ten, double diem_TB, Ngay ngay_thang_nam_sinh, Lop lopSV) {
		this.mssv = mssv;
		this.ho_va_ten = ho_va_ten;
		this.diem_TB = diem_TB;
		this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
		this.lopSV = lopSV;
	}
	public String layTenKhoa() {
		return this.lopSV.getTen_khoa();
	}
	public boolean kiemTraSinhVienCoDau() {
		return this.diem_TB >=5; 
	}
	public boolean kiemTraTrungNgaySinh(Sinh_vien s) {
		return this.ngay_thang_nam_sinh.equals(s.ngay_thang_nam_sinh);
	}
}
