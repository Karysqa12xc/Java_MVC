package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.counter_view;

public class conter_controller implements ActionListener{
	private counter_view ctv;
	public conter_controller(counter_view ctv) {
		this.ctv = ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		System.out.println("Ban da nhan nut: "  + src);
		if(src.equals("UP")) {
			this.ctv.increment();
		}
		else if(src.equals("DOWN")) {
			this.ctv.decrment();
		}
		else {
			this.ctv.resert();
		}
	}
	
	
	
	
	
}
