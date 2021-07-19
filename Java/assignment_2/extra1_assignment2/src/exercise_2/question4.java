package exercise_2;

public class question4 {
	public static void main(String[] args) {
		int a = 8545604;
		int result = 0;
		while (a != 0) {
			int b = a % 10;
			a = a / 10;
			result += b;
		}
		System.out.println(result);
	}
}
