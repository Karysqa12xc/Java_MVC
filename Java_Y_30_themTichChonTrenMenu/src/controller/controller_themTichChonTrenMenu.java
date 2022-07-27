package controller;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;

import view.view_themTichChonTrenMenu;

public class controller_themTichChonTrenMenu implements ActionListener{
	private view_themTichChonTrenMenu vm;
	
	public controller_themTichChonTrenMenu(view_themTichChonTrenMenu vm) {
		this.vm = vm;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Quit")) {
			System.exit(0);
		}if(src.equals("ToolBar")) {
			AbstractButton check = (AbstractButton) e.getSource();
			boolean checkBox = check.getModel().isSelected();//kiểm tra box có đang được tích không
			if(checkBox) {
				this.vm.enableToolBar();
			}else {
				this.vm.disableToolBar();
			}
		}else {
			this.vm.noticeFileMenu("Bạn đã kích vào:"  + src);
		}
		
	}
	
	
	
}
