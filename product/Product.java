package product;

public class Product {
	private int ID; // 5 digit number random
	private String name; // 2 - 20 chars
	private int amount; // >0 random
	private double price; // random

	public void setID(int i) {
		this.ID = i;
	}

	public int getID() {
		return this.ID;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getName() {
		return this.name;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	public double getPrice() {
		return this.price;
	}

	public String toString() {
		String ans = "ID: " + ID + " name: " + name + " amount:" + amount + " price:" + amount;
		return ans;
	}

	public void add(int count) {
		this.amount += count;
	}

	public void remove(int count) {
		if (count > this.amount) {
			System.out.println("Not enough in storage");
		} else {
			this.amount -= count;
		}
	}

	public double getValue() {
		return this.amount * this.price;
	}
}