package main;

public class isGame_1 implements Runnable{
	private gamePanel_4 gamePanel;
	private gameWindow_3 gameWindow_3;
	private Thread gameThread;
	private final int FPS_SET = 120;
	
	public isGame_1() {
		gamePanel = new gamePanel_4();
		gameWindow_3 = new gameWindow_3(gamePanel);
		gamePanel.requestFocus();
		startGameLoop();
	}
	
	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	@Override
	public void run() {
		
		double timePerFrame = 1000000000.0  / FPS_SET;
		long lastFrame = System.nanoTime();
		long now = System.nanoTime();
		long frames = 0;
		long lastCheck = System.currentTimeMillis();
		while(true) {
			
			now = System.nanoTime();
			if(now - lastFrame >= timePerFrame) {
				gamePanel.repaint();
				lastFrame = now;
				frames++;
			}
			
			if(System.currentTimeMillis() - lastCheck >= 1000) {
				lastCheck = System.currentTimeMillis();
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
	}
}
