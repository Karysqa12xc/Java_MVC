package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import controller.controller_taoThucDon;
import model.model_taoThucDon;

public class view_taoThucDon extends JFrame{
	public model_taoThucDon mttd;
	public JLabel jLabel_tieuDe, jLabel_thongTin;
	public JPanel jPanel_tieuDe, jPanel_monChinh, jPanel_monPhu, jPanel_monAn;
	public JPanel jPanel_thanhToan;
	public JRadioButton jRadioButton_Com, jRadioButton_Pho, jRadioButton_Chao;
	public ButtonGroup buttonGroup_monChinh;
	public ArrayList<JCheckBox> list_buttonGroup_monPhu;
	public JCheckBox jCheckBox_soup, jCheckBox_cola, jCheckBox_tea, jCheckBox_cake;
	public JButton jButton;
	public JComboBox<String> jComboBox;
	public JList<String> jList;
	public JScrollPane jScrollPane;
	
	public view_taoThucDon() {
		this.mttd = new model_taoThucDon();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Thực đơn theo dạng comboBox và Jlist");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		//TiÃªu Ä‘á»�
		jLabel_tieuDe = new JLabel("Các món ăn của nhà hàng");
		jLabel_tieuDe.setFont(new Font("Poppins", Font.BOLD, 20));
		jLabel_tieuDe.setForeground(Color.green);
		jPanel_tieuDe = new JPanel();
		jPanel_tieuDe.add(jLabel_tieuDe);
		
		//CÃ¡c mÃ³n Äƒn chÃ­nh cá»§a nhÃ  hÃ ng
		jPanel_monChinh = new JPanel(new FlowLayout());
		String cacMonChinh[] = new String[] {"Cơm", "Phở", "Cháo"};
		jComboBox = new JComboBox<String>(cacMonChinh);
		jComboBox.setFont(new Font("Poppins", Font.BOLD, 20));
		//NÆ¡i nhÃ³m cÃ¡c Radio Buttons
		buttonGroup_monChinh = new ButtonGroup(); 
	
		jPanel_monChinh.add(jComboBox);
		
		
		
		jPanel_monPhu = new JPanel(new GridLayout(1, 4, 0, 20));
		String cacMonPhu[] = new String[] {"soup - 4000vnd", "Cola - 5000vnd", "Cake - 10000vnd", "Tea - 6000vnd"};
		
		jList = new JList<String>(cacMonPhu);
		jList.setFont(new Font("Poppins", Font.BOLD, 20));
		jPanel_monPhu.add(jList);

		
		
		
		jPanel_monAn = new JPanel(new BorderLayout());
		jPanel_monAn.add(jPanel_monChinh, BorderLayout.NORTH);
		jPanel_monAn.add(jPanel_monPhu, BorderLayout.CENTER);
		ActionListener ac = new  controller_taoThucDon(this);
		jPanel_thanhToan = new JPanel(new GridLayout(1 ,2));
		jLabel_thongTin = new JLabel();
		jLabel_thongTin.setFont(new Font("Poppins", Font.PLAIN, 20));
		jButton = new JButton("Thành tiền");
		jButton.addActionListener(ac);
		jButton.setFont(new Font("Poppins", Font.PLAIN, 20));
		
		jPanel_thanhToan.add(jLabel_thongTin);
		jPanel_thanhToan.add(jButton);
		
		
		this.add(jPanel_tieuDe, BorderLayout.NORTH);
		this.add(jPanel_monAn, BorderLayout.CENTER);
		this.add(jPanel_thanhToan, BorderLayout.SOUTH);
	
	}
	
	public void hienThiKetQua() {
		String ketQua = "Check " + this.mttd.getTongTien();
		this.jLabel_thongTin.setText(ketQua);
	}
	
	
	
}
