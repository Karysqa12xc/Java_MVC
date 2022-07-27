package test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.counter_model;
import view.counter_view;
//Bài 81:Mô hình MVC(Model - view - controller)
public class test {
	public static void main(String[] args) {
//		counter_model ct  = new counter_model();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			counter_view ctv = new counter_view();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}	
