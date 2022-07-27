package Overriding_ghi_de_phuong_thuc;

public class Bird extends Animal{
	
	
	public Bird() {
		super("Bird");
	}
	
	@Override
	public void eat() {
		System.out.println("Tôi ăn ngũ cốc và ăn sâu");
	}

	@Override 
	public void makeSound() {
		System.out.println("Cúc cu");
	}

	

	
}
