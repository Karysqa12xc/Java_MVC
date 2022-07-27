package timKiem_sapXep_Mang;

public class Phuong_thuc_sanh_compareTo implements Comparable<Phuong_thuc_sanh_compareTo> {
	private int masv;
	private String hoTen;
	private String tenLop;
	private double trungBinh;
	public Phuong_thuc_sanh_compareTo(int masv, String hoTen, String tenLop, double trungBinh) {
		this.masv = masv;
		this.hoTen = hoTen;
		this.tenLop = tenLop;
		this.trungBinh = trungBinh;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getTrungBinh() {
		return trungBinh;
	}
	public void setTrungBinh(double trungBinh) {
		this.trungBinh = trungBinh;
	}
	
	public String getTen() {
		String s = this.hoTen.trim();
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		}else {
			return s;
		}
	}
	
	
	@Override
	public String toString() {
		return "Sinh Vien [masv=" + masv + ", hoTen=" + hoTen + ", tenLop=" + tenLop + ", trungBinh="
				+ trungBinh + "]";
	}
	@Override
	//CompareTo giúp so sánh hai đối tượng bất kỳ xem đối tượng nào lớn hơn và bé hơn rồi sắp xếp
	public int compareTo(Phuong_thuc_sanh_compareTo o) {
		//Trả về 3 tình huống
		//<0: Đối tượng this nhỏ hơn đối tượng o được chuyền vào
		//>0: Đối tượng this lớn hơn đối tượng o được chuyển vào
		//=0" Đối tượng this bằng đối tượng o được chuyền vào
		//Dựa trên sánh tên
		String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
	}
	
	

	
	
	
	
}
