package Layout_All;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//GridLayout: tạo lưới
public class Ex_main_gridLayout extends JFrame{
	public Ex_main_gridLayout() {
		this.setTitle("Ví dụ_FLowLayOut");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set Layout
		GridLayout gridLayout = new GridLayout(4, 4,25,25);
		this.setLayout(gridLayout);
		//Tạo button
		for(int i = 0; i< 16; i++) {
			JButton jButton = new JButton(i +"");
			this.add(jButton);
		}
		

		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Ex_main_gridLayout();
	}
}
