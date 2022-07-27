package Xu_Ly_Chuoi_P1;

import java.util.Scanner;

public class So_sanh_chuoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "namdeptrai";
		String s2 = "NAMDEPTRAI";
		String s3 = "namdeptrai";
		
		//Hàm equals => so sánh 2 chuỗi có giống nhau không(Có phân biệt chữ hoa chữ thường)
		System.out.println("s1 equals 2: " + s1.equals(s2));
		System.out.println("s1 equals s3: "+ s1.equals(s3));
		//Hàm equalsIgnoreCase=> so sánh 2 chuỗi có giống nhau không(Không phân biệt chữ hoa chữ thường)
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));//Trả về false
		System.out.println("s1 equalsIgnoreCase s3: "+ s1.equalsIgnoreCase(s3));//Trả về true
		
		//Lưu ý: Nếu so sánh mật khẩu và tài khoản của người dùng ta dùng equals
		
		//Hàm compareTo => so sánh > < = ; code: vế 1.compareTo(vế 2)
		//(Nếu trả về giá trị (-) thì vế 1 < vế 2)
		//(Nếu trả về giá trị (+) thì vế 1 > vế 2)
		//(Nếu trả về giá trị 0 thì vế 1  = vế 2)
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));//s1 < s2
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));//s1 > s2
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv4));//s1 = s4
		
		
		//Hàm compareToIgnoreCase => Cũng là so sánh > < = giống compareTo 
		//nhưng không phân biệt chữ hoa chữ thường 
		String sm1 = "NGUYỄN VĂN A";
		String sm2 = "Nguyễn Văn A";
		System.out.println("sm1 compareToIgnoreCase sm2: " + sm1.compareToIgnoreCase(sm2));//sm1 = sm2
		
		//Hàm regionMatches
		//(vị trí bắt đầu chuỗi 1, chuỗi so sánh, vị trí bắt đầu chuỗi 2, vị trí kết thúc chuỗi 2 ) 
		//=> so sánh một đoạn từ chuỗi 1 so với chuỗi thứ 2
		String r1 = "NAM.vn";
		String r2 = "NA.v";
		boolean check = r1.regionMatches(0, r2, 0, 1);
		System.out.println(check + " end");
		
		//Hàm startWith => Hàm kiểm tra một chuỗi bắt đầu bằng (Hàm trả về giá trị là true or false)
		String sdt = "037456894";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("039"));
		
		//Hàm endWith => Hàm kiểm tra một chuỗi kết thúc bằng (Hàm trả về giá trị là true or false)
		String tenFile = "I Love you.JPG";
		String tenFile1 = "Lo dit.PDF";
		if(tenFile.endsWith(".JPG")) {
			System.out.println("Đây là một file ảnh");
		}else if(tenFile.endsWith(".PDF")) {
			System.out.println("Đây là một file powerpoint");
		}
		
		
	}
}
