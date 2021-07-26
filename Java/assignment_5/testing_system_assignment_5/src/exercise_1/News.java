package exercise_1;

public class News implements INews {
	private int id;
	private String title;
	private String publish_Date;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;
	private static int autoId = 0;

	public News(String title, String publish_Date, String author, String content, int[] rates) {
		super();
		autoId++;
		this.id = autoId;
		this.title = title;
		this.publish_Date = publish_Date;
		this.author = author;
		this.content = content;
		this.rates = rates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublish_Date() {
		return publish_Date;
	}

	public void setPublish_Date(String publish_Date) {
		this.publish_Date = publish_Date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public int[] getRates() {
		return rates;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
	}

	public void setAverageRate(float averageRate) {
		this.averageRate = averageRate;
	}

	@Override
	public void Display() {
		System.out.println("\nTitle : " + title + "\nPublishDate : " + publish_Date + "\nAuthor : " + author
				+ "\nContent : " + content + "\nAverageRate : " + averageRate);
	}

	@Override
	public float Calculate() {
		float r = 0;
		for (int x : this.rates) {
			r += x;
		}
		this.averageRate = r / 3;
		return this.averageRate;
	}

}
