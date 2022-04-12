package adult;

public class Adult {
	private String name;
	private int ID;
	private String profession;

	public Adult(String name, int ID, String profession) {
		this.name = name;
		this.ID = ID;
		this.profession = profession;
	}

	public Adult(String name, int ID) {
		this(name, ID, null);
	}

	public Adult(Adult other) {
		this(other.name, other.ID, other.profession);
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.ID;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void show() {
		if (profession == null) {
			System.out.println("Name: " + name + " ID: " + ID);
		} else {
			System.out.println("Name: " + name + " ID: " + ID + " Profession: " + profession);
		}
	}
}