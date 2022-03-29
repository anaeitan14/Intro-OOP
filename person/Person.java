package person;

public class Person {

	private String name;
	private double height, weight;

<<<<<<< HEAD
	public Person(String name, double weight, double height) {
		setName(name);
		setWeight(weight);
		setHeight(height);
	}

	public void setName(String s) {
		if (s.length() >= 2) {
			name = s;
		}
=======
	public void setName(String s) {
		name = s;
>>>>>>> 85e2b94145010ecbbaac2a645e233a0643ec9bad
	}

	public String getName() {
		return name;
	}

	public void setHeight(double h) {
<<<<<<< HEAD
		if (h >= 150 && h <= 260) {
			height = h;
		}
=======
		height = h;
>>>>>>> 85e2b94145010ecbbaac2a645e233a0643ec9bad
	}

	public double getHeight() {
		return height;
	}

	public void setWeight(double w) {
<<<<<<< HEAD
		if (w >= 30.0 && w <= 350.0) {
			weight = w;
		}
=======
		weight = w;
>>>>>>> 85e2b94145010ecbbaac2a645e233a0643ec9bad
	}

	public double getWeight() {
		return weight;
	}

	public void show() {
<<<<<<< HEAD
		System.out.println("Name: " + name + "  height: " + height / 100.0 + " weight: " + weight);
	}
}
=======
		System.out.println("Name: " + name + " height: " + height + " weight: " + weight);
	}

}
>>>>>>> 85e2b94145010ecbbaac2a645e233a0643ec9bad
