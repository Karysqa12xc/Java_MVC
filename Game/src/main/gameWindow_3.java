package main;

import javax.swing.JFrame;

public class gameWindow_3 extends JFrame{
	public gameWindow_3(gamePanel_4 gamePanel) {
		this.setTitle("Game_1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(gamePanel);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}
	
	
}
