package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_lastButton;

public class controller_lastButton implements ActionListener{
	private view_lastButton vb;	
	public controller_lastButton(view_lastButton vb) {
		this.vb = vb;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("1")) {
			this.vb.lastButton_1();
		}else if(src.equals("2")) {
			this.vb.lastButton_2();
		}
		else if(src.equals("3")) {
			this.vb.lastButton_3();
			
		}else if(src.equals("4")){
			this.vb.lastButton_4();
			
		}
	}

}
