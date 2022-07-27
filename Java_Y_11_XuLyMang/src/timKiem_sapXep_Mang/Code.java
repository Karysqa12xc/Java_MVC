package timKiem_sapXep_Mang;

import java.util.Arrays;

public class Code {
	//Hàm đảo ngược mảng
	public static int[] Daomang(int x[]) {
		int rs[] = new int[x.length];
		int index = 0;
		for(int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i]; 
			index++;
		}
		return rs;
	}
	public static void main(String[] args) {
		int a[] = new int[] {8, 2, 6 , 4 , 3, 7, 9};
		int b[] = new int[15];
		//Lấy các giá trị ra khỏi mảng
		System.out.println("a ban đầu: " + Arrays.toString(a));
		//Hàm sắp xếp
		Arrays.sort(a);
		System.out.println("a sau khi sắp xếp: " + Arrays.toString(a));
		
		//Hàm tìm kiếm
			//Trả về giá trị âm thì không có trong mảng
			//Nếu có trong mảng thì trả về vị trí trong mảng
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -7));

		//Hàm điển giá trị
		Arrays.fill(b, 5);
		System.out.println("Xuất mảng b: "+ Arrays.toString(b));
		
		//Hàm sắp xếp giảm dần
		Arrays.sort(a);
		a = Code.Daomang(a);
		System.out.println(Arrays.toString(a));
	}
}
