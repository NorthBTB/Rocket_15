package exercise_6;

public class Employee extends user{
	
	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}

	public double calculatePay() {
		return this.getSalaryRatio() * 420;
	}
}
