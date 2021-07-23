package exercise_5;

public class nhan_vien extends can_bo{
	private String cong_Viec;

	public nhan_vien(String ho_Ten, int tuoi, String gioi_Tinh, String dia_Chi, String cong_Viec) {
		super(ho_Ten, tuoi, gioi_Tinh, dia_Chi);
		this.cong_Viec = cong_Viec;
	}

	public String getCong_Viec() {
		return cong_Viec;
	}

	public void setCong_Viec(String cong_Viec) {
		this.cong_Viec = cong_Viec;
	}

	@Override
	public String toString() {
		return "\nNhan vien : " + this.getHo_Ten() + "\ntuoi : " + this.getTuoi() + "\ngioi_Tinh : " + this.getGioi_Tinh()
		+ "\ndia_Chi : " + this.getDia_Chi() + "\ncong_viec : " + cong_Viec;
	}
		
}
