package Overriding_ghi_de_phuong_thuc;
//Mục tiêu của ghi đè phương thức: Định nghĩa lại một phương thức đã có mặt trong lớp cha
//Quy tắc khi ghì đè
// +Lớp con và lớp cha phải có mối quan hệ kế thừa
// +Tên của phương thức giữa lớp cha và lớp con phải giống nhau
// +Các tham số chuyền vào phương thức của cả lớp cha và lớp con đều giống nhau


public class Animal {
	protected String name; 
	
	
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Đang ăn");
	}

	public void makeSound() {
		System.out.println("................");
	}

	public void Slepp() {
		System.out.println("Zzzzzzzzzzzzzzzzzz");
	}
}
