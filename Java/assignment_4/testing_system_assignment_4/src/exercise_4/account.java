package exercise_4;

public class account {
	private int id;
	private String name;
	private int balance;

	public account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

//	public void setBalance(int balance) {
//		this.balance = balance;
//	}

	public void credit(int amount) {
		this.balance += amount;
	}

	public void debit(int amount) {
		this.balance -= amount;
	}

	public void tranferTo(account a, int amount) {
		this.balance -= amount;
		a.balance += amount;
	}
}
