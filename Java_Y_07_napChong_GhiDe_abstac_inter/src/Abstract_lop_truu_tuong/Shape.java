package Abstract_lop_truu_tuong;

public abstract class Shape{
	protected toaDo toaDo;

	
	
	public Shape(Abstract_lop_truu_tuong.toaDo toaDo) {
		this.toaDo = toaDo;
	}

	public toaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(toaDo toaDo) {
		this.toaDo = toaDo;
	}



	public abstract double tinhDienTich();
	
}
