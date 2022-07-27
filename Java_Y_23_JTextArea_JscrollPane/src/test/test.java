package test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.view_jTextArea;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new view_jTextArea();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
