package exercise_5;

public class cong_nhan extends can_bo {
	private int bac;

	public cong_nhan(String ho_Ten, int tuoi, String gioi_Tinh, String dia_Chi, int bac) {
		super(ho_Ten, tuoi, gioi_Tinh, dia_Chi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "\nCong nhan : " + this.getHo_Ten() + "\ntuoi : " + this.getTuoi() + "\ngioi_Tinh : " + this.getGioi_Tinh()
				+ "\ndia_Chi : " + this.getDia_Chi() + "\nbac : " + bac;
	}

}
