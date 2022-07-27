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
		String monChinh = "";
		String monPhu = "";
		Enumeration<AbstractButton> buttonMonChinh = vttd.buttonGroup_monChinh.getElements();
		while(buttonMonChinh.hasMoreElements()) {
			AbstractButton b = buttonMonChinh.nextElement();
			if(b.isSelected()) {
				monChinh = b.getText();
			}
		}
		
		for (AbstractButton a : vttd.list_buttonGroup_monPhu) {
			if(a.isSelected()) {
				monPhu = monPhu + a.getText() + ",";
			}
		}
	
		vttd.mttd.setLuaChon_monChinh(monChinh);
		vttd.mttd.setLuaChon_monPhu(monPhu);
		vttd.mttd.tinhTongTien();
		vttd.hienThiKetQua();
		
	}
	
	
}
