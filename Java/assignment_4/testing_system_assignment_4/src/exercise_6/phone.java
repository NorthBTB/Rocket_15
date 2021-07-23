package exercise_6;

public abstract class phone {
	public abstract void insertContact(String name, String phone);
	
	public abstract void removeContact(String name);
	
	public abstract void updateContact(String name, String phone);
	
	public abstract void searchContact(String name);
}
