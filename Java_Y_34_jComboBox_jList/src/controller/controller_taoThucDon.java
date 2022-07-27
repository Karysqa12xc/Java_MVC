package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

import view.view_taoThucDon;

public class controller_taoThucDon implements ActionListener{
	private view_taoThucDon vttd;

	public controller_taoThucDon(view_taoThucDon vttd) {
		this.vttd = vttd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String monChinh = vttd.jComboBox.getSelectedItem().toString();
		String monPhu = "";
		Object[] luaChon = vttd.jList.getSelectedValues();
		for (Object object : luaChon) {
			monPhu = monPhu + object.toString() + ",";
		}
		
		vttd.mttd.setLuaChon_monChinh(monChinh);
		vttd.mttd.setLuaChon_monPhu(monPhu);
		vttd.mttd.tinhTongTien();
		vttd.hienThiKetQua();
		
	}
	
	
}
