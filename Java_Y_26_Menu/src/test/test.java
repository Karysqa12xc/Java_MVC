package test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.view_menu;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new view_menu();
	}
}	
