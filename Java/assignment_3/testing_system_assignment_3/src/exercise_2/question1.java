package exercise_2;

import java.time.LocalDate;

public class question1 {
	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		
		Account[] accounts = {account1, account2, account3};
		for(int i=0;i<3;i++) {
			accounts[i].setEmail("Email " + (i+1));
			accounts[i].setUserName("UserName " + (i+1));
			accounts[i].setFullName("FullName " + (i+1));
			accounts[i].setCreateDate(null);
		}
	}
}
