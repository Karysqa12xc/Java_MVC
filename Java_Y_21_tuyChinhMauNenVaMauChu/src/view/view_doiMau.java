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

import controller.controller_doiMau;
import model.model_doiMau;

public class view_doiMau extends JFrame{
	private model_doiMau mdm;
	private JButton jButton_mauChu_1, jButton_mauChu_2, jButton_mauChu_3;
	private JButton jButton_mauNen_1, jButton_mauNen_2, jButton_mauNen_3;
	private JLabel jLabel_text;
	
	public view_doiMau() {
		this.mdm = new model_doiMau();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Đổi màu chứ và nền");
		this.setSize(900, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel_1 = new JPanel(new GridLayout(2, 3));
		JPanel jPanel_2 = new JPanel(new BorderLayout());
 		Font font = new Font("Bahnschrift Semi", Font.PLAIN , 30);
 		ActionListener ac = new controller_doiMau(this);
		jButton_mauChu_1 = new JButton("Màu đỏ chữ");
		jButton_mauChu_1.addActionListener(ac);
		jButton_mauChu_1.setFont(font);
		jButton_mauChu_1.setForeground(Color.red);//đổi màu chữ
		
		jButton_mauChu_2 = new JButton("Màu vàng chữ");
		jButton_mauChu_2.addActionListener(ac);
		jButton_mauChu_2.setFont(font);
		jButton_mauChu_2.setForeground(Color.yellow);//đổi màu chữ
		
		jButton_mauChu_3 = new JButton("Màu xanh chữ");
		jButton_mauChu_3.addActionListener(ac);
		jButton_mauChu_3.setFont(font);
		jButton_mauChu_3.setForeground(Color.blue);//đổi màu chữ
		
		
		jButton_mauNen_1 = new JButton("Màu đỏ nền");
		jButton_mauNen_1.addActionListener(ac);
		jButton_mauNen_1.setFont(font);
		jButton_mauNen_1.setBackground(Color.red);//đổi màu nền
		jButton_mauNen_1.setOpaque(true);//tô màu toàn bộ
		jButton_mauNen_1.setBorderPainted(false); //tô màu toàn bộ
		
		jButton_mauNen_2 = new JButton("Màu vàng nền");
		jButton_mauNen_2.addActionListener(ac);
		jButton_mauNen_2.setFont(font);
		jButton_mauNen_2.setBackground(Color.YELLOW);//đổi màu nền
		jButton_mauNen_2.setOpaque(true);//tô màu toàn bộ
		jButton_mauNen_2.setBorderPainted(false);//tô màu toàn bộ
		
		jButton_mauNen_3 = new JButton("Màu xanh lá nền");
		jButton_mauNen_3.addActionListener(ac);
		jButton_mauNen_3.setFont(font);
		jButton_mauNen_3.setBackground(Color.green);//đổi màu nền
		jButton_mauNen_3.setOpaque(true);//tô màu toàn bộ
		jButton_mauNen_3.setBorderPainted(false);//tô màu toàn bộ
		
		jPanel_1.add(jButton_mauChu_1);
		jPanel_1.add(jButton_mauChu_2);
		jPanel_1.add(jButton_mauChu_3);
		jPanel_1.add(jButton_mauNen_1);
		jPanel_1.add(jButton_mauNen_2);
		jPanel_1.add(jButton_mauNen_3);
		
		jLabel_text = new JLabel("Màu chữ và màu nền để đổi ", JLabel.CENTER);
		jLabel_text.setFont(font);
		jPanel_2.add(jLabel_text, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_1, BorderLayout.SOUTH);
		this.add(jPanel_2, BorderLayout.CENTER);
	}
	
	public void changeTextColor(Color color) {
		this.jLabel_text.setForeground(color);
	}
	public void changeBackGroupColor(Color color) {
		this.jLabel_text.setBackground(color);
		jLabel_text.setOpaque(true);//tô màu toàn bộ
	}
}
