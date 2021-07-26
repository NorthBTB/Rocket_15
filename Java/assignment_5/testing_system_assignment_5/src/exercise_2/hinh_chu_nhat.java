package exercise_2;

public class hinh_chu_nhat implements IHinh {
	private double chieu_Dai;
	private double chieu_Rong;

	public hinh_chu_nhat(double chieu_Dai, double chieu_Rong) {
		super();
		this.chieu_Dai = chieu_Dai;
		this.chieu_Rong = chieu_Rong;
	}

	@Override
	public String chu_Vi() {
		return "Chu vi theo hinh chu nhat : " + (chieu_Dai + chieu_Rong) * 2;
	}

	@Override
	public String dien_Tich() {
		return "Dien tich theo hinh chu nhat : " + chieu_Dai * chieu_Rong;
	}

}
