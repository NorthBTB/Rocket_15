package exercise_1;

import java.util.Date;
import object.Account;
import object.Position;

public class question2 {
	public static void main(String[] args) {
		Position p =new Position(1, "Giam doc");
		Account a1 =new Account();
		Account a2 = new Account(1,"bac@gmail.com","North", "Tien", "Bac");
		Account a3 = new Account(1,"bac@gmail.com","North", "Tien", "Bac",p);
		Account a4 = new Account(1,"bac@gmail.com","North", "Tien", "Bac",p,new Date(System.currentTimeMillis()));
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
	}
}
