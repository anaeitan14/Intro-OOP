package bus;

public class BusCompany {
	private String name;
	private Bus[] busses;
	private int amountBus;

	public BusCompany(String name, int companySize) {
		this.name = name;
		busses = new Bus[companySize];
		amountBus = 0;
	}

	public String getName() {
		return this.name;
	}

	public void addBus(Bus newBus) {
		if (amountBus < busses.length) {
			busses[amountBus++] = newBus;
		} else {
			System.out.println("Cannot add anymore busses to this company");
		}
	}

	public void removeBus(int licenseNumber) {
		for (int i = 0; i < busses.length; i++) {
			if (busses[i].getLicenseNumber() == licenseNumber) {
				busses[i] = null;
			}
		}
	}

	public String toString() {
		return "Company name: " + name + " company has " + amountBus + " busses and the busses details are: "
				+ busses[0].getLicenseNumber();
	}
}