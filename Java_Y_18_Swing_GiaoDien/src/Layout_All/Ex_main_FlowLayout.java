package Layout_All;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//setLocationRelativeTo(null): Căn giữa cửa sổ chương trình
//FlowLayout(): Các Button đi theo một dòng duy nhất

public class Ex_main_FlowLayout extends JFrame{
	
	public void Ex_FlowLayOut() {
		this.setTitle("Ví dụ_FLowLayOut");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set Layout
		FlowLayout flowLayout = new FlowLayout(FlowLayout.TRAILING,100, 100);
		this.setLayout(flowLayout);
		//Tạo button
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		
		//Thêm các thành phần
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Ex_main_FlowLayout fl = new Ex_main_FlowLayout();
		fl.Ex_FlowLayOut();
	}
}
