package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_menu;

public class controller_view implements ActionListener{
	private view_menu vm;
	
	public controller_view(view_menu vm) {
		this.vm = vm;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Open")) {
			this.vm.noticeFileMenu("Bạn đã nhấn nút Open ở File");
		}else if(src.equals("Quit")) {
			System.exit(0);//Hàm thoát chương trình
		}else if(src.equals("Undor Typing")) {
			this.vm.noticeFileMenu("Bạn đã nhấn nút Undor Typing ở Edit");
		}else {
			this.vm.noticeFileMenu("Bạn đã nhấn nút Redo ở Edit");
		}
		
	}
	
	
	
}
