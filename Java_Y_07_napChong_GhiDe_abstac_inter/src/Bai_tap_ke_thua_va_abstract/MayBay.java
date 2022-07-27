package Bai_tap_ke_thua_va_abstract;

public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public MayBay(HangSanXuat tenHangSanXuat, String loaiNhienLieu) {
		super("May bay", tenHangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}


	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}


	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public void catCanh() {
		System.out.println("Bay len tren bau troi");
	}
	
	public void haCanh() {
		System.out.println("Ha canh xuong mat dat-Music");
	}
	
	@Override
	double layVanToc() {
		return 300;
	}

	
}
