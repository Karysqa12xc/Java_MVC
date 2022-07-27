package Abstract_lop_truu_tuong;

public class HinhChuNhat extends Shape{
	private double chieuRong, chieuDai;
	
	public HinhChuNhat(Abstract_lop_truu_tuong.toaDo toaDo, double chieuRong, double chieuDai) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuDai = chieuDai;
	}



	@Override
	public double tinhDienTich() {
		return this.chieuRong * this.chieuDai;
	}
	
}
