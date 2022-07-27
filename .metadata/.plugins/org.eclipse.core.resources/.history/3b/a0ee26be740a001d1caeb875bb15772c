package model;

import java.util.StringTokenizer;

public class model_taoThucDon {
	private String luaChon_monChinh;
	private String luaChon_monPhu;
	private double tongTien;
	
	public model_taoThucDon() {
		this.luaChon_monChinh = "";
		this.luaChon_monPhu = "";
		this.tongTien = 0.0;
	}

	public String getLuaChon_monChinh() {
		return luaChon_monChinh;
	}

	public void setLuaChon_monChinh(String luaChon_monChinh) {
		this.luaChon_monChinh = luaChon_monChinh;
	}

	public String getLuaChon_monPhu() {
		return luaChon_monPhu;
	}

	public void setLuaChon_monPhu(String luaChon_monPhu) {
		this.luaChon_monPhu = luaChon_monPhu;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public void tinhTongTien() {
		this.tongTien = 0;
		if(this.luaChon_monChinh.equals("Cơm")) {
			tongTien += 2000;
		}else if(this.luaChon_monChinh.equals("Cháo")) {
			tongTien += 1000;
		}else if(this.luaChon_monChinh.equals("Phở")) {
			tongTien += 30000;
		}
		StringTokenizer stk = new StringTokenizer(this.luaChon_monPhu, ",");
		while(stk.hasMoreElements()) {
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim();
			if(monPhu.equals("soup - 4000vnd")){
				tongTien += 4000;
			}else if(monPhu.equals("Cola - 5000vnd")) {
				tongTien += 5000;
			}else if(monPhu.equals("Cake - 10000vnd")) {
				tongTien += 10000;
			}else if(monPhu.equals("Tea - 6000vnd")) {
				tongTien += 6000;
			}
		}
		this.tongTien = tongTien;
	}
	
	
}
