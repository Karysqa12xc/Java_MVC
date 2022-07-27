package Kieu_du_Lieu_Enum_special;

public enum Thang {
	Tháng_một(31),
	Tháng_hai(28),
	Tháng_ba(31),
	Tháng_tư(30),
	Tháng_năm(31),
	Tháng_sáu(30),
	Tháng_bảy(31),
	Tháng_tám(30),
	Tháng_mười(31),
	Tháng_mười_một(30),
	Tháng_mười_hai(31);
	
	private final int soNgay;
		Thang(int soNgay){
			this.soNgay = soNgay;
		}
		public int soNgay() {
			return soNgay;
		}
	}

