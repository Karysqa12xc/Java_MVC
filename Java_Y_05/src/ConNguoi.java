
public class ConNguoi {
	private String hoVaTen;
	private int namSinh;
	public ConNguoi(String hoVaTen, int namSinh) {
		super();
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void an() {
		System.out.println("măm măm");
	}
	public void uong() {
		System.out.println("ực ực");
	}
	public void ngu() {
		System.out.println("Khò khò");
	}
}
