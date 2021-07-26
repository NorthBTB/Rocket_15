package exercise_2;

public class hinh_vuong extends hinh_chu_nhat {
	
	public hinh_vuong(double canh) {
		super(canh, canh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String chu_Vi() {
		return "Chu vi theo hinh vuong : "+ super.chu_Vi();
	}

	@Override
	public String dien_Tich() {
		return "Dien tich theo hinh vuong : "+ super.dien_Tich();
	}
}
