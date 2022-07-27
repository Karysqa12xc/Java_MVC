package Xu_Ly_Chuoi_P1;

public class catChuoi_noiChuoi_thayTheChuoi_inHoa {
	public static void main(String[] args) {
		String s1 = "Nam";
		String s2 = ".vn";
		
		String s3 = s1 + s2; // Cách thông thường để nối chuỗi
	//Hàm concat =>nối 2 chuỗi
		//Không làm thay thế giá trị ban đầu
		System.out.println("nối 2 chuỗi");
		String s4 = s1.concat(s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("\n----------------------------\n");
	//Hàm repalce => Thay thế, thay đổi, biến đổi một chuỗi con thành một chuỗi con khác
		//Không làm thay thế dữ liệu ban đầu
		System.out.println("Thay thế, thay đổi, biến đổi một chuỗi con thành một chuỗi con khác");
		String r1 = "Long";
		String r2 = r1.replace("Long", "Nam");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("\n----------------------------\n");
	//Hàm toLowerCase => Chuyển tất cả các ký tự trong chuỗi về chữ thường
		System.out.println("Chuyển tất cả các ký tự trong chuỗi về chữ thường");
		String t1 = "NAM";
		String t2 = t1.toLowerCase();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("\n----------------------------\n");
 	//Hàm toUpperCase => Chuyển tất cả các ký tự trong chuỗi về chữ hoa
		System.out.println("Chuyển tất cả các ký tự trong chuỗi về chữ hoa");
		String t3 = "nam";
		String t4 = t1.toUpperCase();
		System.out.println(t3);
		System.out.println(t4);
		System.out.println("\n----------------------------\n");
	//Hàm trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
		System.out.println("xóa khoảng trắng dư thừa ở đầu chuỗi");
		String tr1 = " Xin chào mình bị trĩ";
		System.out.println(tr1);
		System.out.println(tr1.trim());
		System.out.println("\n----------------------------\n");
	//Hàm substring() => Cắt từ chuỗi cha sang chuỗi con
		//Có hai dạng: 
		//1.substring(Vị trí bắt đầu cắt)
		//2.substring(Vị trí bắt đầu cắt, ví trí kết thúc cắt);

		String sub1 = "Xin chào các bạn mình bị trĩ ";
		String sub2 = sub1.substring(10);
		String sub3 = sub1.substring(10, 15);
		System.out.println(sub2);
		System.out.println(sub3);
	}
}
