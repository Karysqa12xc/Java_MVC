package view_veAnh;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class drawExample extends JFrame{
	public drawExample() {
		this.setTitle("Vẽ");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JPanelDraw jPanelDraw = new JPanelDraw();
		
		this.setLayout(new BorderLayout());
		this.add(jPanelDraw, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
