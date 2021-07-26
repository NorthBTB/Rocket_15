package exercise_2;

public class smart_phone extends phone implements weapon{
	
	public void use_3G() {
		System.out.println("Use 3G");
	}
	public void take_a_picture() {
		System.out.println("Taking a picture");
	}
	@Override
	public void attack() {
		System.out.println("Attacking on Titan by smart phone.");
		
	}
	
}
