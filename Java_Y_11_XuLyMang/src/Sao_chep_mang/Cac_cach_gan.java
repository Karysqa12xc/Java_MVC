package Sao_chep_mang;

import java.util.Arrays;

//Có ba cách để sao chép mảng
//Toán tử gán: copy tham chiếu; khi thay đổi dữ liệu mảng được gán thì mảng gán cũng thay đổi
//clone()//Hàm copy toàn bộ
//System.arraycopy() //Khi thay đổi một mảng sẽ không ảnh hưởng đến mảng kia
public class Cac_cach_gan {
	public static void main(String[] args) {
		//Kiểu nguyên thủy
		int [] mang1 = {1,2,3};
		
		//Copy mảng bằng toán tử gán
		//Arrays.toString để in ra mảng
		int []mang1_a = mang1;
		mang1_a[0] = 100; 
		System.out.println(Arrays.toString(mang1_a));
		
		//Copy mảng bằng cách dùng hàm clone
		int b[] = mang1.clone();
		mang1_a[0] = 50;
		System.out.println(Arrays.toString(b));
	
		//Copy mảng bằng cách dùng hàm System.arraycopy
		int c[] = new int[mang1.length];
		System.arraycopy(mang1, 0, c, 0, mang1.length);
		mang1[0] = 90;
		System.out.println(Arrays.toString(c));
		
		//Kiểu nguyên thủy
		String mang_doi_tuong[] = {"Nam", "Dep", "Trai"};
		String mang_dt_1[] = mang_doi_tuong.clone();
		mang_doi_tuong[0] = "Tấn";
		mang_dt_1[1] = "Xấu";
		System.out.println(Arrays.toString(mang_dt_1));
		
		
	}
}
