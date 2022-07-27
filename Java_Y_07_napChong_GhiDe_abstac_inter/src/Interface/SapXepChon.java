package Interface;

public class SapXepChon implements SapXepInterface {

	@Override
	public void sapXepTang(double[] a) {
		int min;
		for(int i = 0; i < a.length; i++) {
			min = i;
			for(int j = i + 1; j< a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			double tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
		}
	}

	@Override
	public void sapXepGiam(double[] b) {
		int min;
		for(int i = 0; i < b.length; i++) {
			min = i;
			for(int j = i + 1; j < b.length; j++) {
				if(b[j] > b[min]) {
					min = j;
				}
			}
			double tmp = b[i];
			b[i] = b[min];
			b[min] = tmp;
		}
	}




	
}
