package model;

public class model_jTextField {
	private double a;
	private double b;
	private double answer;
	
	public model_jTextField() {
		this.a = 1;
		this.b  =1;
	}
	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getAnswer() {
		return answer;
	}

	public void cong() {
		this.answer = this.a + this.b;
		
	}
	
	public void tru() {
		this.answer = this.a - this.b;
	}
	public void chia() {
		this.answer = this.a / this.b;
	}
	
	public void nhan() {
		this.answer = this.a * this.b;
	}
	
	public void mu() {
		this.answer = Math.pow(this.a,this.b);
	}

	public void Mod() {
		this.answer = this.a % this.b;
	}
	
}
