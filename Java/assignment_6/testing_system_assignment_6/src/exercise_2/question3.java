package exercise_2;

public class question3 {
	public static void main(String[] args) {
		int[] number= {1,2,3};
		
		try {
			System.out.println(number[10]);
		} catch (Exception e) {
			System.out.println("Index out of bound exception");
		}
	}
}
