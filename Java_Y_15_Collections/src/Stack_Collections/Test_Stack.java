package Stack_Collections;

import java.net.Socket;
import java.util.Scanner;
import java.util.Stack;

public class Test_Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> StackChuoi = new Stack<String>();
		
		//1. Push đưa vào bên trong Stack một giá trị theo LIFO
		//2. Pop hàm lấy giá trị ra khỏi stack và xóa giá trị đó
		//3. peek hàm lấy giá trị ra khỏi Stack và không giá trị đó
		//4. Clear() làm cho Stack trống rỗng
		//5. contains() xác định giá trị có tồn tại trong stack hay không
		//6. size() Lấy ra được độ lớn của stack
		   
		//VÍ DỤ 1: ĐẢO NGƯỢC CHUỖI
		System.out.println("Nhập vào một chuỗi: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			StackChuoi.push(s.charAt(i) + "");
		}
		System.out.println("Chuỗi đảo ngược: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(StackChuoi.pop());
		}
		System.out.println();
		//VÍ DỤ 2: CHUYỂN TỪ HỆ THẬP PHÂN SANG HỆ NHỊ PHÂN
		System.out.println("Nhập một số nguyên từ bàn phím: ");
		int x = sc.nextInt();
		Stack<Integer> Binary = new Stack<Integer>();
		while (x > 0) {
			int soDu = x % 2;
			Binary.push(soDu);
			x = x/2;
		}
		System.out.println("Số nhị phân là: ");
		int n = Binary.size();
		for(int i = 0; i < n; i++)
			System.out.print(Binary.pop());
	}
}
