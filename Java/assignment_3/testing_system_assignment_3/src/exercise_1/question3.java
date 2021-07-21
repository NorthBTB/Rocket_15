package exercise_1;

import java.util.Random;

public class question3 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(99999);
		String s = String.valueOf(a);
		while(s.length()<5) {
			s = "0"+s;
		}
		System.out.printf(s);
		
		System.out.println();
		int b = a%100;
		System.out.printf("%02d",b);
	}
}
