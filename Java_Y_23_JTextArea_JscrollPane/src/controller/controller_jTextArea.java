package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_jTextArea;

public class controller_jTextArea implements ActionListener {
	private view_jTextArea vja;

	public controller_jTextArea(view_jTextArea vja) {
		this.vja = vja;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Bạn đã nhập nút");
		this.vja.timKiem();
	}
	
	
}
