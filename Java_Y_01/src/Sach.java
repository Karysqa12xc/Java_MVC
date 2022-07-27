import java.util.Scanner;

public class Sach {
	private String tenSach;
	private int namXuatBan;
	private Tac_Gia tacGia;
	private double giaBan;

	public void inTenSach() {
		System.out.println(this.tenSach);
	}

	public boolean kiemTraCungNam(Sach sachKhac) {
		return namXuatBan == sachKhac.namXuatBan;
}

	public double giaSauKhiGiam(double x) {
		return this.giaBan * (1-x/100);
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public Tac_Gia getTacGia() {
		return tacGia;
	}

	public void setTacGia(Tac_Gia tacGia) {
		this.tacGia = tacGia;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public Sach(String tenSach, int namXuatBan, Tac_Gia tacGia, double giaBan) {
		this.tenSach = tenSach;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.giaBan = giaBan;
	}
}
