package firstLesson;

public class Dog {

	private String name;
	private int age;
	private double weight;

	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Dog Name: " + getName() + "\n"
			   + "    Age: " + getAge();
	}
}
