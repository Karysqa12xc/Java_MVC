package Overriding_ghi_de_phuong_thuc;

public class Cat extends Animal{

	public Cat() {
		super("cat");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() { 
		System.out.println("Tôi ăn cá");
	}

	@Override
	public void makeSound() {
		System.out.println("meo meo");
	}

	
}
