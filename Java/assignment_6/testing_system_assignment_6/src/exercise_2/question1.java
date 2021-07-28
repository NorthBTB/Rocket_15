package exercise_2;

public class question1 {
	public static void main(String[] args) {
		// float result= divide(7,0);
		divide(7, 0);
	}

	public static void divide(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Khong the chia " + a + " so cho 0");
		} finally {
			System.out.println("divide completed!");
		}

	}
}
