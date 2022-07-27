package Layout_All;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_main_BorderLayout extends JFrame{
	public Ex_main_BorderLayout() {
		this.setTitle("Ví dụ_FLowLayOut");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set Layout
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		//Tạo button
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		JButton jButton5 = new JButton("5");
		
		this.add(jButton1, BorderLayout.NORTH);//thêm vào phía trên
		this.add(jButton2, BorderLayout.WEST);//thêm vào bên trái
		this.add(jButton3, BorderLayout.EAST);//thêm vào bên phải 
		this.add(jButton4, BorderLayout.CENTER);//thêm vào giữa
		this.add(jButton5, BorderLayout.SOUTH);//thêm vào dưới
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex_main_BorderLayout();
	}
}
