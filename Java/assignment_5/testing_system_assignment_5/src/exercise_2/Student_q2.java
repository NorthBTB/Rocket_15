package exercise_2;

import java.util.Scanner;

public class Student_q2 extends Person {
	private String msv;
	private double diem_Tb;
	private String email;

	@Override
	public void input_Infor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap msv : ");
		String msv = sc.next();
		System.out.println("Nhap Diem trung binh : ");
		Double tb = sc.nextDouble();
		System.out.println("Nhap email : ");
		String email = sc.next();
		super.input_Infor();		
		this.msv = msv;
		this.diem_Tb = tb;
		this.email = email;
		sc.close();
	}

	@Override
	public void show_Infor() {
		System.out.println("\nMSV : " + this.msv + "\nDiem trung binh : " + this.diem_Tb + "\nEmail : " + email);
		super.show_Infor();
	}

	public boolean isHoc_Bong() {
		if (this.diem_Tb > 8)
			return true;
		return false;
	}

}
