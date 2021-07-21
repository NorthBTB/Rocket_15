package exercise_4;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap chuoi ki tu 1 : ");
		String s1 =sc.next();
		System.out.println("Nhap chuoi ki tu 2 : ");
		String s2 =sc.next();
		sc.close();
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}
}
