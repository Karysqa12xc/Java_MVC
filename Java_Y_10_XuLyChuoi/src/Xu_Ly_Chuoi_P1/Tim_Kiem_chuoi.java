package Xu_Ly_Chuoi_P1;

public class Tim_Kiem_chuoi {
	public static void main(String[] args) {
		String s1 = "Xin chào các bạn mình bị trĩ, Xin chào";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'Ô';
		System.out.println(s1.length());
		//Hàm indexOf =>Hàm indexOf tìm kiếm 1 chuỗi có tồn tại trong chuỗi kia hay không
		//Nếu tìm thấy thì trả về vị trí tồn tại trong chuỗi là: 0 hoặc (+)
		//Không tìm thấy thì trả về giá trị âm
		//Cách 1:
		System.out.println("Vị trí của s2 trong s1 là: "+s1.indexOf(s2));
		System.out.println("Vị trí của s3 trong s1 là: "+ s1.indexOf(s3));
		
		//Cách 2: tìm kiếm tại một vị trí nào đó trong chuỗi
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2, 2));
		//Tìm kiếm char
		System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1));
		
		//Hàm lastIndexOf=> tìm kiếm từ phải sang trái
		System.out.println("Vị trí của s2 trong s1(Từ phải sang trái) là: " + s1.lastIndexOf(s2));
		
		
		
	}
	
}
