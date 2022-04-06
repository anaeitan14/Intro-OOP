package car;

public class Car {
	private int licenseNumber, carSpeed;

	public void setLicenseNumber(int n) {
		licenseNumber = n;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public int getCarSeed() {
		return carSpeed;
	}

	public void accelerate() {
		carSpeed++;
	}

	public void decelerate() {
		carSpeed--;
	}

	public void stopCar() {
		carSpeed = 0;
	}

	public void printDetails() {
		System.out.println("License number - " + licenseNumber);
		System.out.println("The current speed of the car is: " + carSpeed + " km/h");
	}

}
