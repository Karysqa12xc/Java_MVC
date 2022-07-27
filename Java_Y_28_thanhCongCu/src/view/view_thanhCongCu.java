package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.controller_thanhCongCu;

public class view_thanhCongCu extends JFrame {
	private JPanel jPanel_1, jPanel_2;
	private JMenuBar jMenuBar;
	private JMenu jMenu_1, jMenu_2, jMenu_3;
	private JMenuItem jMenuItem_1, jMenuItem_2, jMenuItem_3, jMenuItem_4, jMenuItem_5; 
	
	private JLabel jLabel;

	public view_thanhCongCu() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Tool bar trong Java");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		ActionListener ac = new controller_thanhCongCu(this);

		jPanel_1 = new JPanel();
		jPanel_1.setBackground(Color.blue);
		jPanel_1.setOpaque(true);

		jPanel_2 = new JPanel(new GridLayout(1, 2, 10, 10));

		jMenuBar = new JMenuBar();

		jMenu_1 = new JMenu("File");

		jMenuItem_1 = new JMenuItem("Open");
		jMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.ALT_DOWN_MASK));
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
		jMenuItem_5.addActionListener(ac);
		
		jMenu_3.add(jMenuItem_3);
		jMenu_3.addSeparator();
		jMenu_3.add(jMenuItem_4);
		
		jMenu_2.add(jMenu_3);
		jMenu_2.addSeparator();
		jMenu_2.add(jMenuItem_5);

		jMenuBar.add(jMenu_1);
		jMenuBar.add(jMenu_2);

		this.setJMenuBar(jMenuBar);
		
		//Tạo toolBar (thanh công cụ)
		JToolBar jToolBar = new JToolBar();
		JButton jButton_rename = new JButton("Remane");
		jButton_rename.setToolTipText("Nhận vào đây để thực hiện đổi tên");//Gắn gợi ý chỉ dẫn cho button
		jButton_rename.addActionListener(ac);
		JButton jButton_copy = new JButton("Copy");
		jButton_copy.setToolTipText("Nhấn vào đây để copy");//Gắn gợi ý chỉ dẫn cho button
		jButton_copy.addActionListener(ac);
		JButton jButton_paste = new JButton("paste");
		jButton_paste.setToolTipText("Nhấn vào đây để dán");//Gắn gợi ý chỉ dẫn cho button
		jButton_paste.addActionListener(ac);
		//thêm nút bấm vào thanh toolBar
		jToolBar.add(jButton_rename);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_paste);
		
		
		Font font = new Font("Arial", Font.BOLD, 20);
		jLabel = new JLabel("--------", JLabel.CENTER);
		jLabel.setFont(font);
		jLabel.setForeground(Color.yellow);

		jPanel_1.add(jLabel);
		
		this.add(jPanel_2, BorderLayout.NORTH);
		this.add(jPanel_1, BorderLayout.CENTER);
		this.add(jToolBar, BorderLayout.NORTH);
	}

	public void noticeFileMenu(String s) {
		this.jLabel.setText(s);
	}

}
