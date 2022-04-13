package person2;

public class Person {
	private String name;
	private Person partner;

	public Person(String name, Person partner) {
		setName(name);
		setPartner(partner);
	}

	public Person(String name) {
		this(name, null);
	}

	public void setPartner(Person newPartner) {
		if (partner != newPartner) {
			if (partner != null) {
				partner.setPartner(null);
			}

			partner = newPartner;
			this.partner.setPartner(this);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		if (partner != null) {
			System.out.println("Name: " + name + " --> Partner: " + partner.name);
		} else {
			System.out.println("Name: " + name + " --> No Partner: ");
		}
	}
}
