package Array_list;

import java.util.ArrayList;
import java.util.Objects;

public class Sinh_Vien implements Comparable<Sinh_Vien>{
	protected String Masv, hoVaTen;
	protected int namSinh;
	protected double DTB;
	public Sinh_Vien(String masv, String hoVaTen, int namSinh, double dTB) {
		Masv = masv;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		DTB = dTB;
	}
	public Sinh_Vien(String masv) {
		this.Masv = masv;
		
	}
	
	public String getMasv() {
		return Masv;
	}
	public void setMasv(String masv) {
		Masv = masv;
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
	public double getDTB() {
		return DTB;
	}
	public void setDTB(double dTB) {
		DTB = dTB;
	}
	@Override
	public String toString() {
		return "Sinh_Vien [Masv=" + Masv + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", DTB=" + DTB + "]";
	}
	@Override
	public int compareTo(Sinh_Vien o) {
		return this.Masv.compareTo(o.Masv);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sinh_Vien other = (Sinh_Vien) obj;
		return Objects.equals(Masv, other.Masv);
	}
	
	

	
	
	
	
	
}
