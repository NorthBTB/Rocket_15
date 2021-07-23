package exercise_4;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public boolean isLeapYear() {
		int year = this.year;
		if (year % 4 == 0) {
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
					return true;
				else
					return false;
			} else
				return true;
		} else {
			return false;
		}
	}

}
