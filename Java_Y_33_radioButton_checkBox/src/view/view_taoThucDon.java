package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

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
	
	public view_taoThucDon() {
		this.mttd = new model_taoThucDon();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Thực đơn các món");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		//Tiêu đề
		jLabel_tieuDe = new JLabel("Các món khách có thể gọi");
		jLabel_tieuDe.setFont(new Font("Poppins", Font.BOLD, 20));
		jLabel_tieuDe.setForeground(Color.green);
		jPanel_tieuDe = new JPanel();
		jPanel_tieuDe.add(jLabel_tieuDe);
		
		//Các món ăn chính của nhà hàng
		jPanel_monChinh = new JPanel(new GridLayout(1, 3, 40, 40));
		jRadioButton_Com = new JRadioButton("Cơm - 2000vnd");//Radio button 
		jRadioButton_Com.setFont(new Font("Poppins", Font.PLAIN, 20));
		jRadioButton_Chao = new JRadioButton("Cháo - 1000vnd");//Radio button
		jRadioButton_Chao.setFont(new Font("Poppins", Font.PLAIN, 20));
		jRadioButton_Pho = new JRadioButton("Phở - 30000vnd");//Radio button
		jRadioButton_Pho.setFont(new Font("Poppins", Font.PLAIN, 20));
		//Nơi nhóm các Radio Buttons
		buttonGroup_monChinh = new ButtonGroup(); //Nơi để nhóm các Radio button để user chỉ được chọn một
		buttonGroup_monChinh.add(jRadioButton_Com);
		buttonGroup_monChinh.add(jRadioButton_Chao);
		buttonGroup_monChinh.add(jRadioButton_Pho);
		
		jPanel_monChinh.add(jRadioButton_Com);
		jPanel_monChinh.add(jRadioButton_Chao);
		jPanel_monChinh.add(jRadioButton_Pho);
		
		
		jPanel_monPhu = new JPanel(new GridLayout(1, 4, 0, 20));
		jCheckBox_soup = new JCheckBox("soup - 4000vnd");
		jCheckBox_soup.setFont(new Font("Poppins", Font.PLAIN, 20));
		jCheckBox_cola = new JCheckBox("Cola - 5000vnd");
		jCheckBox_cola.setFont(new Font("Poppins", Font.PLAIN, 20));
		jCheckBox_cake = new JCheckBox("Cake - 10000vnd");
		jCheckBox_cake.setFont(new Font("Poppins", Font.PLAIN, 20));
		jCheckBox_tea = new JCheckBox("Tea - 6000vnd");
		jCheckBox_tea.setFont(new Font("Poppins", Font.PLAIN, 20));
		
		list_buttonGroup_monPhu = new ArrayList<JCheckBox>();//Cách để thêm checkBox
		list_buttonGroup_monPhu.add(jCheckBox_soup);
		list_buttonGroup_monPhu.add(jCheckBox_cola);
		list_buttonGroup_monPhu.add(jCheckBox_cake);
		list_buttonGroup_monPhu.add(jCheckBox_tea);
		
		
		jPanel_monPhu.add(jCheckBox_soup);
		jPanel_monPhu.add(jCheckBox_cola);
		jPanel_monPhu.add(jCheckBox_cake);
		jPanel_monPhu.add(jCheckBox_tea);
		
		
		jPanel_monAn = new JPanel(new GridLayout(2, 1));
		jPanel_monAn.add(jPanel_monChinh);
		jPanel_monAn.add(jPanel_monPhu);
		ActionListener ac = new  controller_taoThucDon(this);
		jPanel_thanhToan = new JPanel(new GridLayout(1 ,2));
		jLabel_thongTin = new JLabel();
		jLabel_thongTin.setFont(new Font("Poppins", Font.PLAIN, 20));
		jButton = new JButton("Tính tiền");
		jButton.addActionListener(ac);
		jButton.setFont(new Font("Poppins", Font.PLAIN, 20));
		
		jPanel_thanhToan.add(jLabel_thongTin);
		jPanel_thanhToan.add(jButton);
		
		
		this.add(jPanel_tieuDe, BorderLayout.NORTH);
		this.add(jPanel_monAn, BorderLayout.CENTER);
		this.add(jPanel_thanhToan, BorderLayout.SOUTH);
	
	}

	public void hienThiKetQua() {
		String ketQua = "Tổng tiền: " + this.mttd.getTongTien();
		this.jLabel_thongTin.setText(ketQua);
	}
	
	
	
}
