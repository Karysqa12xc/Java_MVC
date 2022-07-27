package ConNguoi;

public class Customer extends Person{
	String nhuCau;

	public Customer(String name, int tuoi, String nhuCau) {
		super(name, tuoi);
		this.nhuCau = nhuCau;
	}
	public void MuaDo() {
		System.out.println("Mua dien thoai");
	}
}
