package model;

import java.util.ArrayList;

public class quanLySV {
	private ArrayList<thiSinh> dsts;
	private String luaChon;
	private String tenFile;

	public quanLySV() {
		this.dsts = new ArrayList<thiSinh>();
		this.luaChon = "";
		this.tenFile = "";
	}

	public quanLySV(ArrayList<thiSinh> dsts, String luaChon, String tenFile) {
		this.dsts = dsts;
		this.luaChon = luaChon;
		this.tenFile = tenFile;
	}

	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	public ArrayList<thiSinh> getDsts() {
		return dsts;
	}

	public void setDsts(ArrayList<thiSinh> dsts) {
		this.dsts = dsts;
	}

	@Override
	public String toString() {
		return "quanLySV [dsts=" + dsts + "]";
	}

	public void insert(thiSinh thiSinh) {
		this.dsts.add(thiSinh);
	}

	public void delete(thiSinh ts) {
		this.dsts.remove(ts);
	}

	public void update(thiSinh thiSinh) {
		this.dsts.remove(thiSinh);
		this.dsts.add(thiSinh);
	}

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public boolean kiemTraTonTai(thiSinh ts) {
		for (thiSinh thiSinh : dsts) {
			if (thiSinh.getMaThiSinh() == ts.getMaThiSinh()) {
				return true;
			}
		}
		return false;
	}

}
