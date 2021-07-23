package exercise_4;

public class circle {
	private double radius;
	private String color;

	public circle() {
		super();
	}

	public circle(double radius) {
		super();
		this.radius = radius;
	}

	public circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
