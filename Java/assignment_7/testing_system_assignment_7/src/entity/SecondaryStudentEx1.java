package entity;

public class SecondaryStudentEx1 extends Studentex1{
	private static int COUNT=0;
	
	public SecondaryStudentEx1(int id, String name) {
		super(id, name);
		COUNT++;
		// TODO Auto-generated constructor stub
	}
	
	public static int getCOUNT() {
		return COUNT;
	}
}
