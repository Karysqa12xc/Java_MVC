package Generic_main;

//Bài 66
//Generic là tham số hóa kiểu dữ liệu. Giúp dễ dàng bắt lỗi
//Biểu tượng: < ? >
//Các kiểu Generic: 
// E - Element
// K - key
// N - số
// T - loại
// V - values
public class main {
	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println("Giá trị: " + box.getValue());
		//Dùng Generic
		Box2 b1 = new Box2<Double>(15.6);
		System.out.println("Giá trị box 2 là: " + b1.getValue());
		
	}
}
