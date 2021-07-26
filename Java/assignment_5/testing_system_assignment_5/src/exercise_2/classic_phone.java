package exercise_2;

public class classic_phone extends phone implements weapon{
	public void listen_to_radio() {
		System.out.println("Listening to radio...");
	}
	@Override
	public void attack() {
		System.out.println("Attacking on Titan by classic phone.");
		
	}

}
