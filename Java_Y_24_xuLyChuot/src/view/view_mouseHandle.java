package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import controller.controller_mouseHandle;
import model.model_mouseHandle;

public class view_mouseHandle extends JFrame{
	private model_mouseHandle mmh;
	private JLabel jLabel_postion, jLabel_numberClick, jLabel_mouseComponent;
	private JLabel jLabel_x, jLabel_y, jLabel_addClick, jLabel_checkMouse, jLabel_empty_1,
	jLabel_empty_2;
	
	public view_mouseHandle() throws HeadlessException{
		this.mmh  = new model_mouseHandle();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Xử lý sự kiện của chuột");
		this.setSize(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		controller_mouseHandle ml = new controller_mouseHandle(this);
		JPanel jPanel_1 = new JPanel();
		jPanel_1.setBackground(Color.MAGENTA);
		jPanel_1.setOpaque(true);
		jPanel_1.addMouseListener(ml);
		jPanel_1.addMouseMotionListener(ml);
		
		JPanel jPanel_2 = new JPanel(new GridLayout(3, 3)); 
		
		Font font = new Font("Times new Roman", Font.BOLD, 20);
		jLabel_postion = new JLabel("Position: ");
		jLabel_postion.setFont(font);
		jLabel_postion.setForeground(Color.red);
		
		jLabel_x = new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_x.setForeground(Color.red);
		
		jLabel_y = new JLabel("y = ");
		jLabel_y.setFont(font);
		jLabel_y.setForeground(Color.red);
		
		jLabel_numberClick = new JLabel("numble of click: ");
		jLabel_numberClick.setFont(font);
		jLabel_numberClick.setForeground(Color.red);
		
		jLabel_addClick = new JLabel();
		jLabel_addClick.setFont(font);
		jLabel_addClick.setForeground(Color.red);
		
		jLabel_empty_1 = new JLabel();
		
		jLabel_mouseComponent  = new JLabel("mouse is in component: ");
		jLabel_mouseComponent.setFont(font);
		jLabel_mouseComponent.setForeground(Color.red);
		
		jLabel_checkMouse = new JLabel(this.mmh.getCheckMouseOut());
		jLabel_checkMouse.setFont(font);
		jLabel_checkMouse.setForeground(Color.red);
		jLabel_empty_2 = new JLabel();
		
		jPanel_2.add(jLabel_postion);
		jPanel_2.add(jLabel_x);
		jPanel_2.add(jLabel_y);
		jPanel_2.add(jLabel_numberClick);
		jPanel_2.add(jLabel_addClick);
		jPanel_2.add(jLabel_empty_1);
		jPanel_2.add(jLabel_mouseComponent);
		jPanel_2.add(jLabel_checkMouse);
		jPanel_2.add(jLabel_empty_2);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_1, BorderLayout.CENTER);
		this.add(jPanel_2, BorderLayout.SOUTH);
	}	
	
	public void addClick() {
		this.mmh.addClick();
		this.jLabel_addClick.setText(this.mmh.getCountClick() + "");
	}
	
	public void enterMouse() {
		this.mmh.enterMouse();
		this.jLabel_checkMouse.setText(this.mmh.getCheckMouseIn());
	}
	
	public void exitMouse() {
		this.mmh.exitMouse();
		this.jLabel_checkMouse.setText(this.mmh.getCheckMouseOut());
	}
	public void update(int x, int y) {
		this.mmh.setX(x);
		this.mmh.setY(y);
		this.jLabel_x.setText(this.mmh.getX() + "");
		this.jLabel_y.setText(this.mmh.getY() + "");
	}
}
