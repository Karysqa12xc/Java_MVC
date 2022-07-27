package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.conter_controller;
import model.counter_model;

public class counter_view extends JFrame {
	counter_model ct = new counter_model();
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_resert;
	private JLabel jLabel;
	
	public counter_view() {
		this.ct = new counter_model();
		init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener ac = new conter_controller(this);
		JPanel jPanel = new JPanel(new BorderLayout());
		jButton_up = new JButton("UP");
		jPanel.add(jButton_up, BorderLayout.WEST);
		jButton_up.addActionListener(ac);
		jButton_down = new JButton("DOWN");
		jPanel.add(jButton_down, BorderLayout.EAST);
		jButton_down.addActionListener(ac);
		jButton_resert = new JButton("Resert");
		jPanel.add(jButton_resert, BorderLayout.SOUTH);
		jButton_resert.addActionListener(ac);
		jLabel = new JLabel(ct.getValue() + " ", JLabel.CENTER);
		jPanel.add(jLabel, BorderLayout.CENTER);
		this.setLayout(new BorderLayout());
		this.add(jPanel);
	}
	public void increment() {
		this.ct.increment();
		this.jLabel.setText(ct.getValue() + " ");
	}
	public void decrment() {
		this.ct.decrement();
		this.jLabel.setText(ct.getValue() + " ");
	}
	public void resert() {
		this.ct.resert();
		this.jLabel.setText(ct.getValue() + " ");
	}
	
}
