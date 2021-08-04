package entity;

import java.util.ArrayList;

public class Employee<E extends Number> {
	private int id;
	private String name;
	private ArrayList<E> salaries;

	public Employee(int id, String name, ArrayList<E> salaries) {
		super();
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}

	@Override
	public String toString() {
		String s = "";
		for (E e : salaries) {
			s += e + " ";
		}
		return "\nid : " + id + "\nname : " + name + "\nsalaries : " + s;
	}

	public void lastSalary() {
		System.out.println("Thang luong gan nhat la : " + salaries.get(salaries.size() - 1));
	}

}
