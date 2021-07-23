package exercise_6;

public class manager extends user {

	public manager(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}

	public double calculatePay() {
		return this.getSalaryRatio() * 520;
	}
}
