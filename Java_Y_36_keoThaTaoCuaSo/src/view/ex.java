package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ex_c;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTree;
import javax.swing.JScrollBar;

public class ex extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex frame = new ex();
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
	public ex() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ActionListener ac = new ex_c(this);
		JButton btnNewButton = new JButton("Nh\u1EADp \u0111i");
		btnNewButton.addActionListener(ac);
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(188, 251, 311, 96);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(33, 30, 622, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("-----");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 152, 454, 54);
		contentPane.add(lblNewLabel);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(662, 10, 17, 353);
		contentPane.add(scrollBar);
		this.setVisible(true);
	}
	public void hienThi() {
		String nhap = textField.getText();
		lblNewLabel.setText(nhap);
	}
}
