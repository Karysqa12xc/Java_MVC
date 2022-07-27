package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.controller_jTextField;
import model.model_jTextField;

public class view_jTextField extends JFrame {
	private model_jTextField mdj;
	private JButton jButton_cong, jButton_tru, jButton_chia, jButton_nhan, jButton_mu, jButton_mod;
	private JLabel jLabel_firstValue, jLabel_secondValue, jLabel_answer;
	private JTextField jTextField_1st, jTextField_2st, jTextField_answer;
	public view_jTextField() {
		this.mdj = new model_jTextField();
		this.init();
		this.setVisible(true);
	}
		
	public void init() {
		this.setTitle("Máy tính thu nhỏ");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JPanel jPanel_1 = new JPanel(new GridLayout(2,4,10, 0));
		JPanel jPanel_2 = new JPanel(new GridLayout(3,2,20,10));
		Font font = new Font("Arial", ABORT , 30);
		Font font_2 = new Font("Arial", Font.BOLD , 16);
		ActionListener ac = new controller_jTextField(this);
		jButton_cong = new JButton("+");
		jButton_cong.setFont(font);
		jButton_cong.addActionListener(ac);
		
		jButton_tru = new JButton("-");
		jButton_tru.setFont(font);
		jButton_tru.addActionListener(ac);
		
		jButton_chia = new JButton("/");
		jButton_chia.setFont(font);
		jButton_chia.addActionListener(ac);
		
		jButton_nhan = new JButton("*");
		jButton_nhan.setFont(font);
		jButton_nhan.addActionListener(ac);
		
		jButton_mu = new JButton("^");
		jButton_mu.setFont(font);
		jButton_mu.addActionListener(ac);
		
		jButton_mod = new JButton("MOD");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(ac);
		
		jPanel_1.add(jButton_cong);
		jPanel_1.add(jButton_tru);
		jPanel_1.add(jButton_chia);
		jPanel_1.add(jButton_nhan);
		jPanel_1.add(jButton_mu);
		jPanel_1.add(jButton_mod);
		
		jLabel_firstValue = new JLabel("1st Value: ", JLabel.LEFT);
		jLabel_firstValue.setFont(font_2);
		
		jLabel_secondValue = new JLabel("2st Value: ",JLabel.LEFT);
		jLabel_secondValue.setFont(font_2);
		
		jLabel_answer = new JLabel("Answer: ", JLabel.LEFT);
		jLabel_answer.setFont(font_2);
		
		
		
		jTextField_1st = new JTextField(4);
		jTextField_1st.setFont(font_2);
		
		jTextField_2st = new JTextField(4);
		jTextField_2st.setFont(font_2);
		
		jTextField_answer = new JTextField(4);
		jTextField_answer.setFont(font_2);
		
		jPanel_2.add(jLabel_firstValue);
		jPanel_2.add(jTextField_1st);
		jPanel_2.add(jLabel_secondValue);
		jPanel_2.add(jTextField_2st);
		jPanel_2.add(jLabel_answer);
		jPanel_2.add(jTextField_answer);
		
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_1, BorderLayout.SOUTH);
		this.add(jPanel_2, BorderLayout.NORTH);
	}
	
	public void cong() {
		double fristValue = Double.valueOf(jTextField_1st.getText());//chuyển đổi String về Double
		double secondValue =  Double.valueOf(jTextField_2st.getText());//chuyển đổi String về Double
		this.mdj.setA(fristValue);
		this.mdj.setB(secondValue);
		this.mdj.cong();
		this.jTextField_answer.setText(this.mdj.getAnswer() + "");//Lấy giá trị được tính ghi vào text
	}
	
	
	public void tru() {
		double fristValue = Double.valueOf(jTextField_1st.getText());//chuyển đổi String về Double
		double secondValue =  Double.valueOf(jTextField_2st.getText());//chuyển đổi String về Double
		this.mdj.setA(fristValue);
		this.mdj.setB(secondValue);
		this.mdj.tru();
		this.jTextField_answer.setText(this.mdj.getAnswer() + "");//Lấy giá trị được tính ghi vào text
	}
	
	public void chia() {
		double fristValue = Double.valueOf(jTextField_1st.getText());//chuyển đổi String về Double
		double secondValue =  Double.valueOf(jTextField_2st.getText());//chuyển đổi String về Double
		this.mdj.setA(fristValue);
		this.mdj.setB(secondValue);
		this.mdj.chia();
		this.jTextField_answer.setText(this.mdj.getAnswer() + "");//Lấy giá trị được tính ghi vào text
	}
	
	public void nhan() {
		double fristValue = Double.valueOf(jTextField_1st.getText());//chuyển đổi String về Double
		double secondValue =  Double.valueOf(jTextField_2st.getText());//chuyển đổi String về Double
		this.mdj.setA(fristValue);
		this.mdj.setB(secondValue);
		this.mdj.nhan();
		this.jTextField_answer.setText(this.mdj.getAnswer() + "");//Lấy giá trị được tính ghi vào text
	}
	
	public void mu() {
		double fristValue = Double.valueOf(jTextField_1st.getText());//chuyển đổi String về Double
		double secondValue =  Double.valueOf(jTextField_2st.getText());//chuyển đổi String về Double
		this.mdj.setA(fristValue);
		this.mdj.setB(secondValue);
		this.mdj.mu();
		this.jTextField_answer.setText(this.mdj.getAnswer() + "");//Lấy giá trị được tính ghi vào text
	}
	
	public void Mod() {
		double fristValue = Double.valueOf(jTextField_1st.getText());//chuyển đổi String về Double
		double secondValue =  Double.valueOf(jTextField_2st.getText());//chuyển đổi String về Double
		this.mdj.setA(fristValue);
		this.mdj.setB(secondValue);
		this.mdj.Mod();
		this.jTextField_answer.setText(this.mdj.getAnswer() + "");//Lấy giá trị được tính ghi vào text
	}
}
