package adult;

public class AdultTest {

	public static void main(String[] args) {
		Adult a1 = new Adult("Yossi", 2098580684, "Waiter");
		Adult a2 = new Adult("Josh", 34153312);
		Adult a3 = new Adult(a1);
		Adult a4 = new Adult(a2);
		
		
		a1.show();
		a2.show();
		a3.show();
		a1.setProfession("Pilot");
		a3.show();
	}

}
