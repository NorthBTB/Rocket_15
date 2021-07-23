package exercise_5;

public class ky_su extends can_bo{
	private String nganh_Dao_Tao;

	public ky_su(String ho_Ten, int tuoi, String gioi_Tinh, String dia_Chi, String nganh_Dao_Tao) {
		super(ho_Ten, tuoi, gioi_Tinh, dia_Chi);
		this.nganh_Dao_Tao = nganh_Dao_Tao;
	}

	public String getNganh_Dao_Tao() {
		return nganh_Dao_Tao;
	}

	public void setNganh_Dao_Tao(String nganh_Dao_Tao) {
		this.nganh_Dao_Tao = nganh_Dao_Tao;
	}

	@Override
	public String toString() {
		return "\nKy Su : " + this.getHo_Ten() + "\ntuoi : " + this.getTuoi() + "\ngioi_Tinh : " + this.getGioi_Tinh()
		+ "\ndia_Chi : " + this.getDia_Chi() + "\nnganh dao tao : " + nganh_Dao_Tao;
	}
	
	
}
