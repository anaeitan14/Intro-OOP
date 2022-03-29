package product;

public class ProductTest {

	public static void main(String[] args) {

		Product[] products = buildProductsArr();

	}

	public static double totalValue(Product[] products) {
		double totalSum = 0.0;
		for (int i = 0; i < products.length; i++) {
			totalSum += products[i].getValue();
		}
		return totalSum;
	}

	public static void showProducts(Product[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

	public static void getMostExpProducts(Product[] arr, int num) {
		String item;
	}

	public static Product[] buildProductsArr() {
		Product[] arr = new Product[10];

		return arr;
	}

}
