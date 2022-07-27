package OverLoading_nap_chong_phuong_thuc;
//Mục tiêu của việc nạp chồng phương thức:Tăng tính năng sử dụng cho các phương thức bên trong một lớp
//+Lưu ý: Có chung tên phương thức nhưng khác tham số truyền vào
//Chỉ được thực hiện bên trong một class 
//Là ví dụ đa hình lúc chuẩn bị chạy chương trình
//Giá trị trả về có thể giống hoặc khác nhau
public class MyMath {
	public int timMin(int a, int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public double timMin(double a, double b) {
		return a < b ? a : b;
	}
	
	public double tinhTong(double a, double b) {
		return a + b;
	}
	
	public double tinhTong(double a[]) {
		double tong  = 0;
		for(int i = 0; i < a.length;i++) {
			tong += a[i];
		}
		return tong;
	}
}
