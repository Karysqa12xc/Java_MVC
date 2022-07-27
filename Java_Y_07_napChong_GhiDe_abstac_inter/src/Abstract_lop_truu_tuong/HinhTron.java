package Abstract_lop_truu_tuong;

public class HinhTron extends Shape {
	private double r;
	

	public HinhTron(Abstract_lop_truu_tuong.toaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI * this.r * this.r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
