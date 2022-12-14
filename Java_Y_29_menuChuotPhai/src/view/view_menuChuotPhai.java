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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.controller_menuChuotPhai;
import controller.controller_mouse_menuChuotPhai;

public class view_menuChuotPhai extends JFrame {
	private JPanel jPanel_1, jPanel_2;
	private JMenuBar jMenuBar;
	private JMenu jMenu_1, jMenu_2, jMenu_3;
	private JMenuItem jMenuItem_1, jMenuItem_2, jMenuItem_3, jMenuItem_4, jMenuItem_5; 
	public JPopupMenu jPopupMenu;
	private JLabel jLabel;

	public view_menuChuotPhai() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Tool bar trong Java");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		ActionListener ac = new controller_menuChuotPhai(this);

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
		
	
		JToolBar jToolBar = new JToolBar();
		JButton jButton_rename = new JButton("Remane");
		jButton_rename.setToolTipText("Nh???p v??o ????y ????? ?????i t???n");//G??????n g??????i ???? ch??????? d??????n cho button
		jButton_rename.addActionListener(ac);
		JButton jButton_copy = new JButton("Copy");
		jButton_copy.setToolTipText("Nh???p v??o ????y ?????  copy");//G??????n g??????i ???? ch??????? d??????n cho button
		jButton_copy.addActionListener(ac);
		JButton jButton_paste = new JButton("paste");
		jButton_paste.setToolTipText("Nh???p v??o ????y ????? Paste");//G??????n g??????i ???? ch??????? d??????n cho button
		jButton_paste.addActionListener(ac);
		
		jToolBar.add(jButton_rename);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_paste);
		
		//thanh menu chu???t ph???i
		jPopupMenu = new JPopupMenu();
		jMenuItem_3 = new JMenuItem("Undor Typing");
		jMenuItem_3.addActionListener(ac);

		jMenuItem_4 = new JMenuItem("Redo");
		jMenuItem_4.addActionListener(ac);
		 
		jPopupMenu.add(jMenuItem_3);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItem_4);
		this.add(jPopupMenu);
		
		//th??m s??? ki???n v??o chu???t ph???i
		MouseListener cmm = new controller_mouse_menuChuotPhai(this);
		this.addMouseListener(cmm);
		
		
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
