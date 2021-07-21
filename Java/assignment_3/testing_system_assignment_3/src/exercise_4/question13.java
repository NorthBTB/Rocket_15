package exercise_4;

import java.util.Scanner;

public class question13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String s = sc.next();
		sc.close();
		boolean ok = true;
		if(s.contains("0")||s.contains("1")||s.contains("2")||
			s.contains("3")||s.contains("4")||s.contains("5")||
			s.contains("6")||s.contains("7")||s.contains("8")||
			s.contains("9")) {
			ok = false;
		}
		
		System.out.println(ok);
	}
}
