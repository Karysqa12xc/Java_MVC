package Tesst;



import Code_a.Vidu;

public class TestVD {
	public static void main(String[] args) {
		Vidu vd = new Vidu(5, 6);
		System.out.println(vd.getB());
		
		Code_b.Vidu vd2 = new Code_b.Vidu(1, 2, 3);
		System.out.println(vd2.getC());
	}
}
