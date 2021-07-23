package exercise_1;

import java.util.Date;

import object.Account;
import object.Group;
import object.Position;

public class question3 {
	public static void main(String[] args) {
		Position p = new Position(1, "Giam doc");
		Account a1 = new Account();
		Account a2 = new Account(1, "bac@gmail.com", "North", "Tien", "Bac");
		Account a3 = new Account(1, "bac@gmail.com", "North", "Tien", "Bac", p);
		Account a4 = new Account(1, "bac@gmail.com", "North", "Tien", "Bac", p, new Date(System.currentTimeMillis()));
		Account[] accounts = { a1, a2, a3, a4 };

		String[] userNames = { "North", "An", "John" };

		Group group1 = new Group();

		Group group2 = new Group("happy new year", a4, accounts, new Date(System.currentTimeMillis()));

		Group group3 = new Group("happy new year", a4, userNames, new Date(System.currentTimeMillis()));

	}
}
