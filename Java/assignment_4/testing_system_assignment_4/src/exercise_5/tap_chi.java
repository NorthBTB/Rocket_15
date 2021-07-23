package exercise_5;

public class tap_chi extends tai_lieu{
	private int so_phat_hanh;
	private int thang_phat_hanh;
	
	public tap_chi(int id, String nxb, int amount, int so_phat_hanh, int thang_phat_hanh) {
		super(id, nxb, amount);
		this.so_phat_hanh = so_phat_hanh;
		this.thang_phat_hanh = thang_phat_hanh;
	}
	
	public int getSo_phat_hanh() {
		return so_phat_hanh;
	}
	
	public void setSo_phat_hanh(int so_phat_hanh) {
		this.so_phat_hanh = so_phat_hanh;
	}
	
	public int getThang_phat_hanh() {
		return thang_phat_hanh;
	}
	
	public void setThang_phat_hanh(int thang_phat_hanh) {
		this.thang_phat_hanh = thang_phat_hanh;
	}
	
}
