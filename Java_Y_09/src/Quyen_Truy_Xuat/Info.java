package Quyen_Truy_Xuat;

public class Info {
	private int a; //Quyền truy xuất chỉ được truy xuất trong Class
	int b;//Quyền truy xuất thoải mái bên trong gói  
	protected int c;//Quyền truy xuất được trong class, trong các class chung một package và 
	//các lớp được kế thừa từ lớp cha, không truy xuất khác gói được
	public int d;//Đâu cũng được 
	
	public void Phuong_thuc() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
		
	}
}
