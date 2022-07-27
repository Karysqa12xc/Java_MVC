package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.counterListensder;
import model.counter_model;

public class counter_view extends JFrame{
	private counter_model ct;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_deep;
	private JLabel  jLabel_value;
	public counter_view() {
		this.ct = new counter_model();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Counter");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener al = new counterListensder(this);
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(al);
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(al);
		jButton_deep = new JButton("Resert");
		jButton_deep.addActionListener(al);
		jLabel_value = new JLabel(this.ct.getValue() + " ", JLabel.CENTER);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_down, BorderLayout.EAST);
		jPanel.add(jButton_deep, BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	public void increment() {
		this.ct.increment();
		this.jLabel_value.setText(this.ct.getValue() + " ");
	}
	public void decrement() {
		this.ct.decrement();
		this.jLabel_value.setText(this.ct.getValue() + " ");
	}
	public void resert() {
		this.ct.resert();
		this.jLabel_value.setText(this.ct.getValue() + " ");
	}
}
