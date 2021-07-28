package exercise_2;

public class question4 {
	public static void main(String[] args) {

		Department[] ds = { new Department("abc"), new Department("def"), new Department("xyz") };
		getIndex(4, ds);

	}

	public static void getIndex(int i, Department[] ds) {
		try {
			System.out.println(ds[i].toString());
		} catch (Exception e) {
			System.out.println("Cannot find department.");
		}
	}
}
