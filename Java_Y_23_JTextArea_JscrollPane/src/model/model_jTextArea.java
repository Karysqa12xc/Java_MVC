package model;

public class model_jTextArea {
	private String vanBan, tuKhoa, ketQua;
	
	public model_jTextArea() {
		this.vanBan = "";
		this.tuKhoa = "";
		this.ketQua = "";
	}
	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}

	public void timKiem() {
		int dem = 0;
		int viTri = 0;
		while(true) {
			int i = this.vanBan.indexOf(this.tuKhoa, viTri);
			if(i == -1) {
				break;
			}else {
				dem++;
				viTri = i + 1; 
			}
		}
		this.ketQua = "Kết quả: có " + dem + " từ "+ this.tuKhoa;
		System.out.println(ketQua);
	}
	
}
