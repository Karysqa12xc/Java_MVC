package Bai_tap_ke_thua_va_abstract;

public class XeOto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	

	public XeOto(HangSanXuat tenHangSanXuat, String loaiNhienLieu) {
		super("O to", tenHangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	
	
	
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}


	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}




	@Override
	double layVanToc() {
		return 100;
	}

	
	
	
	
}
