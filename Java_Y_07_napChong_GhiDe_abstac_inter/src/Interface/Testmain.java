package Interface;

public class Testmain {
	public static void main(String[] args) {
		MayTinhCasioFx500 m1 = new MayTinhCasioFx500();
		System.out.println("Phep Cong: "+ m1.cong(5, 4));
		System.out.println("Phep tru: "+ m1.tru(5, 2));
		System.out.println("Phep nhan: "+ m1.nhan(2, 5));
		System.out.println("Phep chia: " + m1.chia(10, 5));
		System.out.println("Phep chia cho 0: " + m1.chia(5, 0));
		
		System.out.println("Test sap xep: ");
		SapXepChen s1 = new SapXepChen();
		SapXepChon s2 = new SapXepChon();
		double a[] = new double[] {7, 8, 1, 4, 5, 6};
		s2.sapXepTang(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
		}
		
		System.out.println("test phan mem may tinh: ");
		PhanMemMayTinh p1 = new PhanMemMayTinh();
		
	}
}
