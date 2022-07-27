package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import view.counter_view;

public class counterListensder implements ActionListener {
	private counter_view ctv;
	public counterListensder(counter_view ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		System.out.println("Ban da nhan nut: " + src);
		if(src.equals("UP")){
			this.ctv.increment();
		}else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}else if(src.equals("Resert")) {
			this.ctv.resert();
		}
	}

}
