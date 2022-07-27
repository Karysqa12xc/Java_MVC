package JPanel_giaoDien;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//Bài 80: Cách sử dụng JPanel
//JTextField: Trường văn bản để thêm phần tử vào chương trình
//JPanel: là môt class trong Java, nó là một vật chứa, có thể chứa thành phần khác trong một chương trình
public class MyCalculator extends JFrame{
	public MyCalculator() {
		//Tạo cửa sổ
		this.setTitle("Máy tính của tao");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JTextField jTextField = new JTextField();
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout(30,30));
		jPanel_head.add(jTextField, BorderLayout.CENTER);
		JPanel jPanel_buttons_number = new JPanel();
		
		for(int i = 0;i < 10;i++) {
			JButton jButton = new JButton(i + "");
			jPanel_buttons_number.setLayout(new GridLayout(3,3,10,10));
			jPanel_buttons_number.add(jButton, i);
			
		}
		JPanel jPanel_phepTinh = new JPanel();
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru =  new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");
		jPanel_phepTinh.setLayout(new GridLayout(0,1,10,10));
		jPanel_phepTinh.add(jButton_cong);
		jPanel_phepTinh.add(jButton_tru);
		jPanel_phepTinh.add(jButton_nhan);
		jPanel_phepTinh.add(jButton_chia);
		jPanel_phepTinh.add(jButton_bang);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_buttons_number, BorderLayout.CENTER);
		this.add(jPanel_phepTinh, BorderLayout.EAST);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); khuyến khích nên sử dụng cái này
			new MyCalculator();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
