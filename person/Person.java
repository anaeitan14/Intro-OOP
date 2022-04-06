package person;

public class Person {

	private String name;
	private double height, weight;

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setWeight(double w) {
		weight = w;
	}

	public double getWeight() {
		return weight;
	}

	public void show() {
		System.out.println("Name: " + name + " height: " + height + " weight: " + weight);
	}

}
