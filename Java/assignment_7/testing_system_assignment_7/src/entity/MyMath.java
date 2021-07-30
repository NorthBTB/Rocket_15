package entity;

public class MyMath {
	public static final double PI = 3.14;

	// ham tim min cua 1 mang
	public static int min(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int x : a) {
			if (x < min) {
				min = x;
			}
		}
		return min;
	}

	// ham tim sum cua 1 mang
	public static int sum(int[] a) {
		int sum = 0;
		for (int x : a) {
			sum += x;
		}
		return sum;
	}

	public static double sum(int a) {
		return PI + a;
	}
}
