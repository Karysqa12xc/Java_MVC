package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_thanhCongCu;

public class controller_thanhCongCu implements ActionListener{
	private view_thanhCongCu vm;
	
	public controller_thanhCongCu(view_thanhCongCu vm) {
		this.vm = vm;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Quit")) {
			System.exit(0);
		}else {
			this.vm.noticeFileMenu("Bạn đã click vào: " + src);
		}
		
	}
	
	
	
}
