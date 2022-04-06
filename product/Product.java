package product;

public class Product {
	private int ID; 
	private String name; 
	private int amount; 
	private double price; 

	public void setID(int i) {
		this.ID = i;
	}

	public int getID() {
		return this.ID;
	}

	public void setName(String n) {
		if(n.length() >= 2 && n.length() <= 20) {
			this.name = n;
		} else {
			System.out.println("Too short/long of a name");
		}
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
		return "ID: " + ID + " name: " + name + " amount:" + amount + " price:" + price;
	}

	public void add(int count) {
		if(count > 0) {
			this.amount += count;
		} else {
			System.out.println("Cannot add a negative amount");
		}
	}

	public void remove(int count) {
		if (count > this.amount) {
			System.out.println("Not enough in storage");
		} else {
			this.amount -= count;
		}
	}

	public double value() {
		return this.amount * this.price;
	}
}