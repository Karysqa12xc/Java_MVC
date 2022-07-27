package ConNguoi;

public class Employee extends Person{
	double Luong;
	String tenCongViec;
	
	public Employee(String name, int tuoi, double luong, String tenCongViec) {
		super(name, tuoi);
		Luong = luong;
		this.tenCongViec = tenCongViec;
	}
	public void diLam() {
		System.out.println("Kiem tien! ");
	}
}
