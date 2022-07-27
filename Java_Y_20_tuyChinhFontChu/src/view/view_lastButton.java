package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.controller_lastButton;
import model.model_lastButton;

public class view_lastButton extends JFrame {
	private model_lastButton md;
	private JButton button_1, button_2, button_3, button_4;
	private JLabel jLabel_va;
	public view_lastButton() {
		this.md = new model_lastButton();
		init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Last button value");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel_1 = new JPanel(new GridLayout(2,2,10,10));
		JPanel jPanel_2 = new JPanel(new BorderLayout());
		ActionListener ac = new controller_lastButton(this);
		Font font = new Font("", Font.ITALIC, 100);//dòng tùy chỉnh font chữ
		
		button_1 = new JButton("1");
		button_1.setFont(font);
		button_1.addActionListener(ac);
		
		button_2 = new JButton("2");
		button_2.setFont(font);
		button_2.addActionListener(ac);
		
		button_3 = new JButton("3");
		button_3.setFont(font);
		button_3.addActionListener(ac);
		
		button_4 = new JButton("4");
		button_4.setFont(font);
		button_4.addActionListener(ac);
		
		jLabel_va = new JLabel("-------", JLabel.CENTER);
		jLabel_va.setFont(font);
		jPanel_1.add(button_1);
		jPanel_1.add(button_2);
		jPanel_1.add(button_3);
		jPanel_1.add(button_4);
		jPanel_2.add(jLabel_va);
		this.setLayout(new BorderLayout());
		this.add(jPanel_1, BorderLayout.CENTER);
		this.add(jPanel_2, BorderLayout.SOUTH);
		
	}
	public void lastButton_1() {
		this.md.setValue(1);
		this.jLabel_va.setText("Last Button was no: " + this.md.getValue());
	}
	public void lastButton_2() {
		this.md.setValue(2);
		this.jLabel_va.setText("Last Button was no: " + this.md.getValue());
	}
	public void lastButton_3() {
		this.md.setValue(3);
		this.jLabel_va.setText("Last Button was no: " + this.md.getValue());
	}
	public void lastButton_4() {
		this.md.setValue(4);
		this.jLabel_va.setText("Last Button was no: " + this.md.getValue());
	}
	
	
}
