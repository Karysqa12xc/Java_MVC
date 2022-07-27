package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_menuChuotPhai;

public class controller_menuChuotPhai implements ActionListener{
	private view_menuChuotPhai vm;
	
	public controller_menuChuotPhai(view_menuChuotPhai vm) {
		this.vm = vm;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Quit")) {
			System.exit(0);
		}else {
			this.vm.noticeFileMenu("Bạn đã kích vào:"  + src);
		}
		
	}
	
	
	
}
