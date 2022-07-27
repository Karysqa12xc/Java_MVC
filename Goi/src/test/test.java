package test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.counter_view;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		counter_view ctv = new counter_view();
	}
	
}
