package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_phimTat;



public class controller_phimTat implements ActionListener{
	private view_phimTat vm;
	
	public controller_phimTat(view_phimTat vm) {
		this.vm = vm;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Open")) {
			this.vm.noticeFileMenu("Bạn đã nhấn nút Open ở File");
		}else if(src.equals("Quit")) {
			System.exit(0);//HÃ m thoÃ¡t chÆ°Æ¡ng trÃ¬nh
		}else if(src.equals("Undor Typing")) {
			this.vm.noticeFileMenu("Bạn đã nhấn nút Undor Typing ở Edit");
		}else {
			this.vm.noticeFileMenu("Bạn đã nhấn nút Redo ở Edit");
		}
		
	}
	
	
	
}
