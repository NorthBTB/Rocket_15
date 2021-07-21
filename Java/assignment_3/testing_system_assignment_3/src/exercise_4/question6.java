package exercise_4;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten : ");
		String s= sc.nextLine();
		sc.close();
		String[] s1 = s.split(" ");
		System.out.println("Ho : " + s1[0]);
		System.out.print("Ten Dem : ");
		for(int i=1;i<s1.length-1;i++) {
			System.out.print(s1[i] + " ");
		}
		System.out.println();
		System.out.println("Ten : "+s1[s1.length-1]);
	}

}
