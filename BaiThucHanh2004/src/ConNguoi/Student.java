package ConNguoi;

public class Student extends Person {
	String khoa;
	String MaSinhVien;
	
	public Student(String name, int tuoi, String khoa, String maSinhVien) {
		super(name, tuoi);
		this.khoa = khoa;
		MaSinhVien = maSinhVien;
	}

	public void DiLenLop() {
		System.out.println("Lai xe len Mo Dia Chat");
	}
}
