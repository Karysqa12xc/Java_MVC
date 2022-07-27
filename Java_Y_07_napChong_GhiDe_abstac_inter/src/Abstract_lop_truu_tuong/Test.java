package Abstract_lop_truu_tuong;

public class Test {
	public static void main(String[] args) {
		toaDo td1 = new toaDo(5, 5);
		toaDo td2 = new toaDo(7, 9);
		toaDo td3 = new toaDo(12, 1);
		
//		Shape h1 = new Shape(td1) => Loi bien dich;
		Shape h1 = new Diem(td1);
		Shape h2 = new HinhTron(td1, 10);
		Shape h3 = new HinhChuNhat(td3, 5, 10);
		
		System.out.println("DT1: " + h1.tinhDienTich());
		System.out.println("DT2: " + h2.tinhDienTich());
		System.out.println("DT3: " + h3.tinhDienTich());
		
	}
}
