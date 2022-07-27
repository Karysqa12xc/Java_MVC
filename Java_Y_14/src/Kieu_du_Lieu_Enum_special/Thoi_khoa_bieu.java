package Kieu_du_Lieu_Enum_special;

public class Thoi_khoa_bieu {
	private Day thu;
	private Sex gioiTinh;
	private String cacMonHoc;
	public Thoi_khoa_bieu(Day thu, Sex gioiTinh, String cacMonHoc) {
		this.thu = thu;
		this.gioiTinh = gioiTinh;
		this.cacMonHoc = cacMonHoc;
	}
	public Day getThu() {
		return thu;
	}
	public void setThu(Day thu) {
		this.thu = thu;
	}
	public Sex getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(Sex gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getCacMonHoc() {
		return cacMonHoc;
	}
	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}
	@Override
	public String toString() {
		return "Thoi_khoa_bieu [thu=" + thu + ", gioiTinh=" + gioiTinh + ", cacMonHoc=" + cacMonHoc + "]";
	}
	
	
	
	
	
	
	

		
}
