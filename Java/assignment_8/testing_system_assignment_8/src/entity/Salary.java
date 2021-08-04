package entity;

public class Salary<T extends Number> {
	private T salary;

	public Salary(T salary) {
		super();
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary : " + salary);
	}
}
