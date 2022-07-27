package model;

import java.awt.Color;

public class model_doiMau {
	private Color foreground; // màu chữ
	private Color background; // màu nền
	private boolean opaque; //tô màu cả viền

	public model_doiMau() {
		this.foreground = Color.green;
		this.background = Color.black;
		this.opaque = true;
	}

	public Color getForeground() {
		return foreground;
	}

	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	
	
	
	
	
}
