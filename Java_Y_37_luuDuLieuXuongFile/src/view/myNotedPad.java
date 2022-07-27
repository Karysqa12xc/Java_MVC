package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.controller_myNotePad;
import model.model_myNotePad;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class myNotedPad extends JFrame {

	private JPanel contentPane;
	public model_myNotePad mmnp;
	public JLabel lblNewLabel;
	public JTextArea text;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myNotedPad frame = new myNotedPad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myNotedPad() {
		this.mmnp = new model_myNotePad();
		setTitle("Open File and save File");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		ActionListener ac = new controller_myNotePad(this);
		text = new JTextArea();
		text.setFont(new Font("Arial", Font.PLAIN, 20));
		text.setForeground(new Color(0, 0, 0));
		JScrollPane scrollPane = new JScrollPane(text);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 10, 199, 40);
		panel.add(lblNewLabel);
		
		JButton ButtonOpen = new JButton("Open File");
		ButtonOpen.addActionListener(ac);
		ButtonOpen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ButtonOpen.setBounds(372, 10, 160, 40);
		panel.add(ButtonOpen);
		
		JButton ButtonSave = new JButton("Save File");
		ButtonSave.addActionListener(ac);
		ButtonSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ButtonSave.setPreferredSize(new Dimension(75, 21));
		ButtonSave.setMaximumSize(new Dimension(75, 21));
		ButtonSave.setMinimumSize(new Dimension(75, 21));
		ButtonSave.setBounds(548, 10, 156, 40);
		panel.add(ButtonSave);
		setVisible(true);

	}
}
