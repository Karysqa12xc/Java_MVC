package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controller.controller_view;

public class view_menu extends JFrame {
	private JPanel jPanel_1, jPanel_2;
	private JMenuBar jMenuBar;// Lưu trữ các JMenu trên một thanh Menu
	private JMenu jMenu_1, jMenu_2, jMenu_3;// Tạo một menu lưu trữ cac JMenuItem
	private JMenuItem jMenuItem_1, jMenuItem_2, jMenuItem_3, jMenuItem_4, jMenuItem_5; 
	// Các JMenuitem(được xử lý cuối cùng)
	private JLabel jLabel;

	public view_menu() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Ví dụ thanh Menu trong Java");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		ActionListener ac = new controller_view(this);

		jPanel_1 = new JPanel();
		jPanel_1.setBackground(Color.blue);
		jPanel_1.setOpaque(true);

		jPanel_2 = new JPanel(new GridLayout(1, 2, 10, 10));

		jMenuBar = new JMenuBar();

		jMenu_1 = new JMenu("File");

		jMenuItem_1 = new JMenuItem("Open");
		jMenuItem_1.addActionListener(ac);

		jMenuItem_2 = new JMenuItem("Quit");
		jMenuItem_2.addActionListener(ac);

		jMenu_1.add(jMenuItem_1);
		jMenu_1.addSeparator();
		jMenu_1.add(jMenuItem_2);

		jMenu_3 = new JMenu("Content Assist");

		

		jMenu_2 = new JMenu("Edit");

		jMenuItem_3 = new JMenuItem("Undor Typing");
		jMenuItem_3.addActionListener(ac);

		jMenuItem_4 = new JMenuItem("Redo");
		jMenuItem_4.addActionListener(ac);
		 
		jMenuItem_5 = new JMenuItem("Cut");
		
		jMenu_3.add(jMenuItem_3);
		jMenu_3.addSeparator();
		jMenu_3.add(jMenuItem_4);
		
		jMenu_2.add(jMenu_3);
		jMenu_2.addSeparator();
		jMenu_2.add(jMenuItem_5);

		jMenuBar.add(jMenu_1);
		jMenuBar.add(jMenu_2);

		this.setJMenuBar(jMenuBar);// Hàm thêm thanh MenuBar

		Font font = new Font("Arial", Font.BOLD, 20);
		jLabel = new JLabel("--------", JLabel.CENTER);
		jLabel.setFont(font);
		jLabel.setForeground(Color.yellow);

		jPanel_1.add(jLabel);
		this.setLayout(new BorderLayout());
		this.add(jPanel_2, BorderLayout.NORTH);
		this.add(jPanel_1, BorderLayout.CENTER);

	}

	public void noticeFileMenu(String s) {
		this.jLabel.setText(s);
	}

}
