package model;

public class model_mouseHandle {
	private int x, y, countClick;
	private String checkMouseIn, checkMouseOut;
	
	
	public model_mouseHandle() {
		this.x = 0;
		this.y = 0;
		this.countClick = 0;
		this.checkMouseOut = "NO";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCountClick() {
		return countClick;
	}

	public void setCountClick(int countClick) {
		this.countClick = countClick;
	}

	public String getCheckMouseIn() {
		return checkMouseIn;
	}

	public void setCheckMouseIn(String checkMouseIn) {
		this.checkMouseIn = checkMouseIn;
	}

	public String getCheckMouseOut() {
		return checkMouseOut;
	}

	public void setCheckMouseOut(String checkMouseOut) {
		this.checkMouseOut = checkMouseOut;
	}

	public void addClick() {
		this.countClick++;
	}
	
	public void enterMouse() {
		checkMouseIn = "YES";
	}
	
	public void exitMouse() {
		checkMouseOut = "NO";
	}	
	
	
	
}
