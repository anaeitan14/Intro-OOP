package person2;

public class PersonTest {

	public static void main(String[] args) {
		Person one = new Person("Shimi");
		Person two = new Person("Shlomo", one);
		two.show();
	}

}
