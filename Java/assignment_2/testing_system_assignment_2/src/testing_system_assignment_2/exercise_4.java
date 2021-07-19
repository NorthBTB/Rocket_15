package testing_system_assignment_2;

import java.time.LocalDate;
import java.util.Random;

public class exercise_4 {
	public static void main(String[] args) {
		// ---------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("//Exercise4");

		Random random = new Random();
		// ----
		System.out.println();
		System.out.println("//Question1");
		System.out.println(random.nextInt());

		// ----
		System.out.println();
		System.out.println("//Question2");
		System.out.println(random.nextDouble());

		// ----
		System.out.println();
		System.out.println("//Question3");
		String[] names = { "Nguyen Van An", "Do Xuan Canh", "Pham Nhat Duong" };
		System.out.println(names[random.nextInt(2)]);

		// ----
		System.out.println();
		System.out.println("//Question4");
		int minday = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxday = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randInt1 = minday + random.nextInt(maxday - minday);
		System.out.println(LocalDate.ofEpochDay(randInt1));

		// ----
		System.out.println();
		System.out.println("//Question4");
		int now = (int) LocalDate.now().toEpochDay();
		long randInt2 = now - random.nextInt(365);
		System.out.println(LocalDate.ofEpochDay(randInt2));

		// ----
		System.out.println();
		System.out.println("//Question5");
		long randInt3 = random.nextInt(now - 1);
		System.out.println(LocalDate.ofEpochDay(randInt3));

		// ----
		System.out.println();
		System.out.println("//Question5");
		int randInt4 = 100 + random.nextInt(899);
		System.out.println(randInt4);
	}
}
