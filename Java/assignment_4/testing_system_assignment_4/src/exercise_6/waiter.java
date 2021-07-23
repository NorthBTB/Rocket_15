package exercise_6;

public class waiter extends user {

	public waiter(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}

	public double calculatePay() {
		return this.getSalaryRatio() * 220;
	}
}
