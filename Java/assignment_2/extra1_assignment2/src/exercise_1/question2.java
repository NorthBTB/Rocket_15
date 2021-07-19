package exercise_1;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		sc.close();
		int h = s / 3600;
		int m = (s - h * 3600) / 60;
		s = (s - h * 3600 - m * 60);
		System.out.printf("%02d:%02d:%02d",h,m,s);
	}

}
