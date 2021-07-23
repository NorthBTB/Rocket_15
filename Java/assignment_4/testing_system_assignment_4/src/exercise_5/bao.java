package exercise_5;

import java.util.Date;

public class bao extends tai_lieu{
	private Date ngay_phat_hanh;

	public bao(int id, String nxb, int amount, Date ngay_phat_hanh) {
		super(id, nxb, amount);
		this.ngay_phat_hanh = ngay_phat_hanh;
	}

	public Date getNgay_phat_hanh() {
		return ngay_phat_hanh;
	}

	public void setNgay_phat_hanh(Date ngay_phat_hanh) {
		this.ngay_phat_hanh = ngay_phat_hanh;
	}
	
}
