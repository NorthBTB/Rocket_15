package exercise_2;

public class Position {
	private static int COUNT = 0;
	private int positionID;
	private String positionName;

	public Position(String positionName) {
		super();
		COUNT++;
		this.positionID = COUNT;
		this.positionName = positionName;
	}

	public Position() {
		super();
		COUNT++;
		this.positionID = COUNT;
		System.out.println("Nhap ten chuc vu : ");
		this.positionName = question8.inputString();
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

}
