package ConNguoi;

public class VipCustomer extends Person{
	String uuDai;

	public VipCustomer(String name, int tuoi, String uuDai) {
		super(name, tuoi);
		this.uuDai = uuDai;
	}
	public void Vip() {
		System.out.println("Mua nhieu len duoc uu dai");
	}
}
