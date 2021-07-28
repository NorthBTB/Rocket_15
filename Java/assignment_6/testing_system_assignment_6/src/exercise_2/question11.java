package exercise_2;

public class question11 {
	public static void main(String[] args) throws InvalidAgeInputingException {
		Account a= new Account("Bac");
		int age = a.inputAge();
		System.out.println(age);
	}
}
