package exercise_4;

import java.util.Scanner;

public class question10 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap chuoi thu nhat : ");
		s1= sc.next();
		System.out.println("Nhap chuoi thu hai : ");
		s2=sc.next();
		sc.close();
		StringBuilder str =new StringBuilder(s2);
		if(s1.equals(str.reverse().toString())) {
			System.out.println("OK");
		}
		else {
			System.out.println("KO");
		}
	}
}
