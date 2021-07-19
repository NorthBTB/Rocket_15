package testing_system_assignment_2;

import java.util.Locale;

public class exercise_2 {
	public static void main(String[] args) {
		//--------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("//Exercise2");
			
		//----
		System.out.println();
		System.out.println("//Question1");
		int a1 = 5;
		System.out.println(a1);
				
		//----
		System.out.println();
		System.out.println("//Question2");
		int a2 = 100000000;
		System.out.printf(Locale.US,"%,d", a2);		
				
		//----
		System.out.println();
		System.out.println("//Question3");
		double a3 = 5.567098;
		System.out.printf("%.4f",a3);
				
		//----
		System.out.println();
		System.out.println("//Question4");
		String a4 = "Nguyen Van A";
		System.out.println("Toi la " + a4 + " va dang doc than");		
	}
}
