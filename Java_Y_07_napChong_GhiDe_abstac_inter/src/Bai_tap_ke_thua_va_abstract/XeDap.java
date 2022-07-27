package Bai_tap_ke_thua_va_abstract;

public class XeDap extends PhuongTienDiChuyen {
	

	public XeDap(HangSanXuat tenHangSanXuat) {
		super("Xe dap", tenHangSanXuat);
	}

	@Override
	double layVanToc() {
		return 20;
	}

}
