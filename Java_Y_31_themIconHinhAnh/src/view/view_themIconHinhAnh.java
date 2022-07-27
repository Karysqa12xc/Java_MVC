package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class view_themIconHinhAnh extends JFrame {
	private JMenu menu, subJMenu;
	private JMenuItem i1, i2, i3, i4, i5;
	private JMenuBar mb = new JMenuBar();
	private JButton jButton;
	private JLabel jLabel;

	public view_themIconHinhAnh() {
		this.setTitle("Thêm hình ảnh và icon");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		//Set Icon =>JFrame(Thay icon của chương trình Java)
		URL url_notePad = view_themIconHinhAnh.class.getResource("Apps-Notepad-Metro-icon.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_notePad);
		this.setIconImage(img);
		
		
		menu = new JMenu("Menu");

		subJMenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("New");
		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_themIconHinhAnh.class.getResource("New-file-icon.png"))));
		
		i2 = new JMenuItem("Save");
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_themIconHinhAnh.class.getResource("Save-icon.png"))));
		
		i3 = new JMenuItem("Save As");
		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_themIconHinhAnh.class.getResource("Save-as-icon.png"))));
		
		i4 = new JMenuItem("Exit");
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_themIconHinhAnh.class.getResource("Actions-window-close-icon.png"))));
		
		i5 = new JMenuItem("Test");
		i5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_themIconHinhAnh.class.getResource("Test-Tube-2-icon.png"))));
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		
		subJMenu.add(i4);
		subJMenu.add(i5);
		
		menu.add(subJMenu);
		
		mb.add(menu);
		this.setJMenuBar(mb);
		 
		jButton = new JButton("Đây là nút nhấn");
		jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_themIconHinhAnh.class.getResource("Test-Tube-2-icon.png"))));
		jButton.setFont(new Font("Times new Roman", Font.BOLD, 20));
//		jButton.setSize(100, 100);
		
		jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_themIconHinhAnh.class.getResource("Screenshot_1.png"))));
		this.add(jLabel, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new view_themIconHinhAnh();
	}
}
