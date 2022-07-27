package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.View;

import controller.controller_themTichChonTrenMenu;
import controller.controller_mouse_themTichChonTrenMenu;

public class view_themTichChonTrenMenu extends JFrame {
	private JPanel jPanel_1, jPanel_2;
	private JMenuBar jMenuBar;
	private JMenu jMenu_1, jMenu_2, jMenu_3;
	private JMenuItem jMenuItem_1, jMenuItem_2, jMenuItem_3, jMenuItem_4, jMenuItem_5; 
	public JPopupMenu jPopupMenu;
	private JLabel jLabel;
	private JToolBar jToolBar;

	public view_themTichChonTrenMenu() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Tool bar trong Java");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		ActionListener ac = new controller_themTichChonTrenMenu(this);

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
		
		//tạo một jMenu mới
		JMenu jMenu_tick = new JMenu("Tick");
		JCheckBoxMenuItem jCheckBoxMenuItem_view = new JCheckBoxMenuItem("ToolBar");
		jCheckBoxMenuItem_view.addActionListener(ac);
		jMenu_tick.add(jCheckBoxMenuItem_view);
		
		
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
		jMenuBar.add(jMenu_tick);
		jMenuBar.add(jMenu_2);
		
		this.setJMenuBar(jMenuBar);
		
	
		jToolBar = new JToolBar();
		JButton jButton_rename = new JButton("Remane");
		jButton_rename.setToolTipText("Nhấp vào đây để đổi tến");
		jButton_rename.addActionListener(ac);
		JButton jButton_copy = new JButton("Copy");
		jButton_copy.setToolTipText("Nhấp vào đây để  copy");
		jButton_copy.addActionListener(ac);
		JButton jButton_paste = new JButton("paste");
		jButton_paste.setToolTipText("Nhấp vào đây để Paste");
		jButton_paste.addActionListener(ac);
		
		jToolBar.add(jButton_rename);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_paste);
		
		//thanh menu chuột phải
		jPopupMenu = new JPopupMenu();
		jMenuItem_3 = new JMenuItem("Undor Typing");
		jMenuItem_3.addActionListener(ac);

		jMenuItem_4 = new JMenuItem("Redo");
		jMenuItem_4.addActionListener(ac);
		 
		jPopupMenu.add(jMenuItem_3);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItem_4);
		this.add(jPopupMenu);
		
		//thêm sự kiện vào chuột phải
		MouseListener cmm = new controller_mouse_themTichChonTrenMenu(this);
		this.addMouseListener(cmm);
		
		
		Font font = new Font("Arial", Font.BOLD, 20);
		jLabel = new JLabel("--------", JLabel.CENTER);
		jLabel.setFont(font);
		jLabel.setForeground(Color.yellow);

		jPanel_1.add(jLabel);
		
		this.add(jPanel_2, BorderLayout.NORTH);
		this.add(jPanel_1, BorderLayout.CENTER);
		
	}

	public void noticeFileMenu(String s) {
		this.jLabel.setText(s);
	}
	public void enableToolBar() {
		this.add(jToolBar, BorderLayout.NORTH);
		this.refersh();
	}
	public void disableToolBar() {
		this.remove(jToolBar);
		this.refersh();
	}
	
	public void refersh() {
		this.setResizable(false);
		this.pack(); //Hiển thị thêm thành phần mới trong cửa sổ
		this.setSize(400, 400);
		this.setResizable(true);
	}
}
