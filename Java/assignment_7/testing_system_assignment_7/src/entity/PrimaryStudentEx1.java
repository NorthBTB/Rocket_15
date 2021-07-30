package entity;

public class PrimaryStudentEx1 extends Studentex1{
	private static int COUNT=0;
	public PrimaryStudentEx1(int id, String name) {	
		super(id, name);
		COUNT++;
		// TODO Auto-generated constructor stub
	}
	
	public static int getCOUNT() {
		return COUNT;
	}

}
