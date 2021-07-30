package entity;

public class HinhTron extends Hinh {

	public HinhTron(double a) throws HinhHocException {
		super(a);

	}

	@Override
	public double chuvi() {
		return 3.14 * super.getA();
	}

	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return 3.14 * super.getA() * super.getA();
	}

}
