package ConNguoi;

public class FullTime extends Employee{
	String lichLamViec;

	public FullTime(String name, int tuoi, double luong, String tenCongViec, String lichLamViec) {
		super(name, tuoi, luong, tenCongViec);
		this.lichLamViec = lichLamViec;
	}
	
	public void MongUoc() {
		System.out.println("Mua xe o to");
	}
	
}
