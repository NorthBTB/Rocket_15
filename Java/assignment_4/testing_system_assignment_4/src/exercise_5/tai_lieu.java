package exercise_5;

public class tai_lieu {
	private int id;
	private String nxb;
	private int sl;
	
	public tai_lieu(int id, String nxb, int amount) {
		super();
		this.id = id;
		this.nxb = nxb;
		this.sl = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public int getAmount() {
		return sl;
	}

	public void setAmount(int amount) {
		this.sl = amount;
	}
	
}
