package view_veAnh;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel{

	public JPanelDraw() {
		this.setBackground(Color.white);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.drawLine(100, 100, 150, 200);//Vẽ đường thẳng
		g.setColor(Color.blue);
		g.drawOval(255, 255, 50, 50);//Vẽ hình oval
		
		g.drawRect(30, 30, 160, 160);//Vẽ hình chứ nhật
		
		g.setColor(Color.cyan);
		g.fillOval(300, 248, 50, 50);//Vẽ hình oval tô đặc màu
		
		g.fillRect(100, 400, 50, 100);//Vẽ hình chữ nhật đặc màu
		
		g.setColor(Color.DARK_GRAY);
		Font font = new Font("Arian", ABORT, 20);
		g.setFont(font);
		g.drawString("Nam đẹp trai", 225, 225);
		
	}

	
	
	
	
}
