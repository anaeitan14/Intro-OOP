package product;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Product[] products = buildProductsArr();
		showProducts(products);
		double totalValue = totalValue(products);
		System.out.printf("The total value of the shop is:%.2f\n", totalValue);
		System.out.println("Enter the value you want to compare");
		int number = s.nextInt();
		getMostExpProducts(products, number);
	}

	public static double totalValue(Product[] products) {
		double totalSum = 0.0;
		for (int i = 0; i < products.length; i++) {
			totalSum += products[i].value();
		}
		return totalSum;
	}

	public static void showProducts(Product[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

	public static void getMostExpProducts(Product[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].value() > num) {
				System.out.println(arr[i].getName());
			}
		}
	}

	public static Product[] buildProductsArr() {
		Scanner s = new Scanner(System.in);
		Product[] arr = new Product[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Product();
			System.out.printf("Enter a name for product number %d\n", i + 1);
			String name = s.nextLine();
			int ID = (int) ((Math.random() * 89999) + 10000);
			double price = (int) (Math.random() * 150) + 10;
			arr[i].setName(name);
			arr[i].setID(ID);
			arr[i].setPrice(price);
			arr[i].add(((int) (Math.random() * 100)) + 1);
		}

		return arr;
	}

}