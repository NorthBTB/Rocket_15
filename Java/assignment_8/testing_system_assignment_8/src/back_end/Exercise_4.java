package back_end;

import java.util.ArrayList;
import java.util.Scanner;

import entity.MyMath;

public class Exercise_4 {
	private static Scanner sc = new Scanner(System.in);

	public static void question3() {
		System.out.println(max(3.1d, 2));
		System.out.println(max(2.3d, 3.1f));
	}

	// tim max cua 2 so
	public static <T extends Number> T max(T a, T b) {
		if (a.doubleValue() > b.doubleValue()) {
			return a;
		}
		return b;
	}
	
	public static void question4() {
		MyMath<Integer> myInt = new MyMath<Integer>();
		MyMath<Float> myFloat = new MyMath<Float>();
		
		int sum1= myInt.sum(1,2);
		float sum2 = myFloat.sum(1.3f,3.4f,2.9f);
		float sum3 = myFloat.sum(1.3f,3.4f,2.9f,4.7f);
		int sub1 = myInt.sub(1, 4);
		float sub2 = myFloat.sub(4.5f, 2.1f);
		float m1 =  myFloat.mu(4.5f, 3);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(m1);
		
	}
	
	public static void question5() {
		ArrayList<Object> listWildcards = new ArrayList<Object>();
		listWildcards.add("Nguyen Van Nam");
		listWildcards.add(30);
		listWildcards.add("Ha Dong, Ha Noi");
		for(Object o:listWildcards) {
			System.out.println(o);
		}
	}
}
