package entity;

public abstract class Hinh implements IHinh {
	private double a;

	private static int COUNT = 0;

	public Hinh(double a) throws HinhHocException {
		super();
		COUNT++;
		if (COUNT <= Configs.SO_LUONG_HINH_TOI_DA) {
			this.a = a;
		} else {
			throw new HinhHocException();
		}
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}

}
