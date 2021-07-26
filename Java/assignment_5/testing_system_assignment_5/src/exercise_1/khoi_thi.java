package exercise_1;

public class khoi_thi {
	private String ten_Khoi;
	private String mon_Thi;
	
	public khoi_thi(String ten_Khoi) {
		super();
		this.ten_Khoi = ten_Khoi;
		switch (this.ten_Khoi) {
		case "A":
			this.mon_Thi=" Toan, Ly, Hoa";
			break;
		case "B":
			this.mon_Thi=" Toan, Hoa, Sinh";
			break;
		case "C":
			this.mon_Thi=" Van, Su, Dia";
			break;

		default:
			this.mon_Thi=null;
			break;
		}
	}

	public String getTen_Khoi() {
		return ten_Khoi;
	}

	public void setTen_Khoi(String ten_Khoi) {
		this.ten_Khoi = ten_Khoi;
	}

	public String getMon_Thi() {
		return mon_Thi;
	}

	public void setMon_Thi(String mon_Thi) {
		this.mon_Thi = mon_Thi;
	}
	
	
}
