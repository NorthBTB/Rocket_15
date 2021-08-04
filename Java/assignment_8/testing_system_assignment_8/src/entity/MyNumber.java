package entity;

public class MyNumber <T extends Number>{
	private T number;

	public MyNumber(T number) {
		super();
		this.number = number;
	}

	public T getNumber() {
		return number;
	}
	
}
