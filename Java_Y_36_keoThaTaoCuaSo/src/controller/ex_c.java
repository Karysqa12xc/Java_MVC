package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ex;

public class ex_c implements ActionListener{
	private ex viDu;

	public ex_c(ex viDu) {
		this.viDu = viDu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Nhập đi")) {
			this.viDu.hienThi();
		}
	}
	
	
}
