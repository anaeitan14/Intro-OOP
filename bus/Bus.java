package bus;

public class Bus {
	private int licenseNumber;
	private int seats;

	public Bus(int licenseNumber, int seats) {
		this.licenseNumber = licenseNumber;
		this.seats = seats;
	}

	public int getSeats() {
		return this.seats;
	}

	public int getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String toString() {
		return "License number: " + licenseNumber + " Seats: " + seats;
	}
}