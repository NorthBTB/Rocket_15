package exercise_1;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap cm : ");
		double cm = scanner.nextDouble();
		scanner.close();
		double inch = cm / 2.54;
		double foot = inch / 12;
		System.out.printf("%.2f %s",cm, " cm = ");
		System.out.printf( "%.2f %s",inch, " inch = ");
		System.out.printf("%.2f %s",foot, " foot.");

	}
}
