package exercise_6;

public abstract class user {
	private String name;
	private double salaryRatio;
	
	public String getName() {
		return name;
	}

	public double getSalaryRatio() {
		return salaryRatio;
	}

	public user(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}

	public void inputName(String name) {
		
	}
	
	public abstract double  calculatePay();
	
	public void displayInfor() {
		System.out.println("Ten : " + name);
		System.out.println("He so luong: " + salaryRatio);
		System.out.println("Luong : " +  calculatePay());

	}
}
