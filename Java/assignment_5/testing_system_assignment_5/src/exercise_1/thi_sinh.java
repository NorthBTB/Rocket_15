package exercise_1;

public class thi_sinh {
	private int sbd;
	private String ten;
	private String dia_Chi;
	private int muc_Uu_Tien;
	private khoi_thi khoi_Thi;

	public thi_sinh(int sbd, String ten, String dia_Chi, int muc_Uu_Tien, String khoi_Thi) {
		super();
		this.sbd = sbd;
		this.ten = ten;
		this.dia_Chi = dia_Chi;
		this.muc_Uu_Tien = muc_Uu_Tien;
		this.khoi_Thi = new khoi_thi(khoi_Thi);
	}

	@Override
	public String toString() {
		return "\nsbd : " + sbd + "\nten : " + ten + "\ndia chi : " + dia_Chi + "\nmuc uu tien : " + muc_Uu_Tien
				+ "\nkhoi thi=" + khoi_Thi.getTen_Khoi() + " - " + khoi_Thi.getMon_Thi();
	}

	public int getSbd() {
		return sbd;
	}
		

}
