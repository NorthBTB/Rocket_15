package entity;

public class HinhChuNhat extends Hinh {
	private double b;

	public HinhChuNhat(double a, double b) throws HinhHocException {
		super(a);
		this.b = b;
	}

	@Override
	public double chuvi() {
		return 2 * (super.getA() + b);

	}

	@Override
	public double dientich() {
		return super.getA() * b;

	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
