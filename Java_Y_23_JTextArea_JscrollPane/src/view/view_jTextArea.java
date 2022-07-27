package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.controller_jTextArea;
import model.model_jTextArea;
//Bài 85 + 86
public class view_jTextArea extends JFrame{
	private model_jTextArea mja;
	private JButton jButton_thongKe;
	private JLabel jLabel_vanBan, jLabel_tuKhoa, jLabel_ketQua;
	private JTextField jTextField;
	private JTextArea jTextArea_vanBan; //Ghi văn bản có xuống dòng
	private JScrollPane jScrollPane;//Thanh cuộn
	public view_jTextArea() {
		this.mja = new model_jTextArea();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Tìm kiếm văn bản");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel  jPanel_1 = new JPanel(new GridLayout(2, 2, 20, 20));
		JPanel jPanel_2 = new JPanel(new GridLayout(0, 1));
		JPanel jPanel_3 = new JPanel(new GridLayout(1,1));
		Font font = new Font("Aria", ABORT, 30);
		Font font_2 = new Font("Aria", ABORT, 20);
		ActionListener ac = new controller_jTextArea(this); 
		
		
		jButton_thongKe = new JButton("Thống kế");
		jButton_thongKe.addActionListener(ac);
		jButton_thongKe.setForeground(Color.white);
		jButton_thongKe.setBackground(Color.black);
		jButton_thongKe.setOpaque(true);
		jButton_thongKe.setBorderPainted(false);
		jButton_thongKe.setFont(font);
		jLabel_ketQua = new JLabel("------------------", JLabel.RIGHT);
		jLabel_ketQua.setFont(font_2);
		jLabel_ketQua.setForeground(Color.ORANGE);
		
		jLabel_tuKhoa = new JLabel("Từ khóa", JLabel.LEFT);
		jLabel_tuKhoa.setFont(font);
		jTextField = new JTextField();
		jTextField.setFont(font);
		
		jPanel_1.add(jLabel_tuKhoa);
		jPanel_1.add(jTextField);
		jPanel_1.add(jButton_thongKe);
		jPanel_1.add(jLabel_ketQua);
		
		jLabel_vanBan = new JLabel("Văn bản", JLabel.LEFT);
		jLabel_vanBan.setFont(font_2);
		jTextArea_vanBan = new JTextArea();
		jTextArea_vanBan.setFont(font_2);
		jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//Cách tùy chỉnh thanh cuộn(Horizon là thanh ngang VERTICAL là thanh dọc)
		
		jPanel_3.add(jLabel_vanBan);
		jPanel_2.add(jScrollPane);	
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_3, BorderLayout.NORTH);
		this.add(jPanel_2, BorderLayout.CENTER);
		this.add(jPanel_1, BorderLayout.SOUTH);
		
		
	}
	
	public void timKiem() {
		this.mja.setVanBan(jTextArea_vanBan.getText());
		this.mja.setTuKhoa(jTextField.getText());
		this.mja.timKiem();
		this.jLabel_ketQua.setText(this.mja.getKetQua());
	}
}
