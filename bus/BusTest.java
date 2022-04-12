package bus;

public class BusTest {

	public static void main(String[] args) {
		Bus b1 = new Bus(12345, 45);
		Bus b2 = new Bus(4312, 22);
		Bus b3 = new Bus(1211, 12);
		Bus b4 = new Bus(11, 66);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());

		BusCompany kavim = new BusCompany("Kavim", 3);
		kavim.addBus(b1);
		kavim.addBus(b2);
		kavim.addBus(b3);
		kavim.addBus(b4);
		kavim.removeBus(12345);

		System.out.println(kavim.toString());

	}

}