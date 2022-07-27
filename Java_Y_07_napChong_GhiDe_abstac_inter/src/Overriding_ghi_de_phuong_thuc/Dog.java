package Overriding_ghi_de_phuong_thuc;

public class Dog extends Animal{

	public Dog() {
		super("Dog");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Tôi ăn xương");
	} 

	@Override
	public void makeSound() {
		System.out.println("Ẳng ẳng");
	}
	
	

}
