
public class Hang_San_Xuat {
	private String tenHangSanXuat;
	private String quocGia;
	public Hang_San_Xuat(String tenHangSanXuat, String quocGia) {
		
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = quocGia;
	}
	public void inTenHSX() {
		System.out.println(tenHangSanXuat);
	}
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}
	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
	
}
