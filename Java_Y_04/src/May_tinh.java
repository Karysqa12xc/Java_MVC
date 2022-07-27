
public class May_tinh {
	private Hang_San_Xuat Hsx;
	private Ngay_San_Xuat Nsx;
	private double giaBan;
	private int thoiGianBaoHanh;
	
	public May_tinh(Hang_San_Xuat hsx, Ngay_San_Xuat nsx, double giaBan, int thoiGianBaoHanh) {
		Hsx = hsx;
		Nsx = nsx;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public Hang_San_Xuat getHsx() {
		return Hsx;
	}

	public void setHsx(Hang_San_Xuat hsx) {
		Hsx = hsx;
	}

	public Ngay_San_Xuat getNsx() {
		return Nsx;
	}

	public void setNsx(Ngay_San_Xuat nsx) {
		Nsx = nsx;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean kiemTraGia(May_tinh m1) {
		return this.giaBan < m1.giaBan;
	}
	
	public String layTenQuocGia() {
		return this.Hsx.getQuocGia().getTenQuocGia();
	}
	
}
