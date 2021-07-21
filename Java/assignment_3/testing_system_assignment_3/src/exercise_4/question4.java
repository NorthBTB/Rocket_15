package exercise_4;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		for(int i=0;i<s.length();i++) {
			System.out.println("Ky tu thu " + i + " la : " + s.substring(i,i+1));
		}
	}

}
