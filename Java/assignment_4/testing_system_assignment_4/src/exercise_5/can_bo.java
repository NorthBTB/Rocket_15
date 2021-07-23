package exercise_5;

public class can_bo {
	private String ho_Ten;
	private int tuoi;
	private String gioi_Tinh;
	private String dia_Chi;

	public can_bo(String ho_Ten, int tuoi, String gioi_Tinh, String dia_Chi) {
		super();
		this.ho_Ten = ho_Ten;
		this.tuoi = tuoi;
		this.gioi_Tinh = gioi_Tinh;
		this.dia_Chi = dia_Chi;
	}

	public String getHo_Ten() {
		return ho_Ten;
	}

	public void setHo_Ten(String ho_Ten) {
		this.ho_Ten = ho_Ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioi_Tinh() {
		return gioi_Tinh;
	}

	public void setGioi_Tinh(String gioi_Tinh) {
		this.gioi_Tinh = gioi_Tinh;
	}

	public String getDia_Chi() {
		return dia_Chi;
	}

	public void setDia_Chi(String dia_Chi) {
		this.dia_Chi = dia_Chi;
	}

	@Override
	public String toString() {
		return "\nho_Ten : " + ho_Ten + "\ntuoi : " + tuoi + "\ngioi_Tinh : " + gioi_Tinh + "\ndia_Chi : " + dia_Chi;
	}

}
