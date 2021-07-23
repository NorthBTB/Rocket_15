package exercise_5;

public class sach extends tai_lieu{
	private String tac_Gia;
	private int so_Trang;
	
	public sach(int id, String nxb, int amount, String tac_Gia, int so_Trang) {
		super(id, nxb, amount);
		this.tac_Gia = tac_Gia;
		this.so_Trang = so_Trang;
	}

	public String getTac_Gia() {
		return tac_Gia;
	}

	public void setTac_Gia(String tac_Gia) {
		this.tac_Gia = tac_Gia;
	}

	public int getSo_Trang() {
		return so_Trang;
	}

	public void setSo_Trang(int so_Trang) {
		this.so_Trang = so_Trang;
	}
	
	
}
