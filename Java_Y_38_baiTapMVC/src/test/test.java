package test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.giaoDienQuanLySV;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new giaoDienQuanLySV();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
