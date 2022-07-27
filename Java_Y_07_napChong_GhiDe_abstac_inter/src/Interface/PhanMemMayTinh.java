package Interface;

public class PhanMemMayTinh implements MayTinhBoTuiinterface, SapXepInterface{

	@Override
	public void sapXepTang(double[] a) {
		for(int i = 0; i < a.length; i++) {
			double x = a[i];
			double pos = i - 1;
			while(pos >= 0.0 && a[(int)pos] > x) {
				a[(int)pos + 1] = a[(int)pos];
				pos--;
			}
			a[(int)pos + 1] = x;
			pos++;
			
		}
	}

	@Override
	public void sapXepGiam(double[] b) {
		for(int i = 0; i < b.length; i++) {
			double x = b[i];
			double pos = i - 1;
			while(pos >= 0.0 && b[(int)pos] < x) {
				b[(int)pos + 1] = b[(int)pos];
				pos--;
			}
			b[(int)pos + 1] = x;
			pos++;
			
		}
	}

	@Override
	public double cong(double a, double b) {
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		return a / b;
	}
	

}
