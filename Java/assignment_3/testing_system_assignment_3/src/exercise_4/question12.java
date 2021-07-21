package exercise_4;

import java.util.Scanner;

public class question12 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String s =sc.next();
		sc.close();
		String r ="";
		for(int i=s.length()-1;i>=0;i--) {
			r+=s.substring(i,i+1);
		}
		System.out.println("Chuoi nghich dao : " + r);
	}
}
