package Interface;

public class MayTinhVinaCal500 implements MayTinhBoTuiinterface{

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a  + b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}
