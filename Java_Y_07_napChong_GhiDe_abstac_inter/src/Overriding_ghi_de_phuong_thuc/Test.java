package Overriding_ghi_de_phuong_thuc;

public class Test {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();
		
		d1.eat();
		d1.makeSound();
		d1.Slepp();
		
		System.out.println("-------");
		
		c1.eat();
		c1.makeSound();
		c1.Slepp();
		
		System.out.println("--------");
		b1.eat();
		b1.makeSound();
		b1.Slepp();
		
		
	}
}
