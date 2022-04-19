package stream;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamExample11 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		ArrayList<Product> productsList1 = new ArrayList<Product>();
		
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(6, "Mobile", 20000f));
		productsList.add(new Product(7, "Laptop", 60000f));
		productsList.add(new Product(8, "Laptop", 60000f));
		
		List<Float> pricesList = productsList.stream().filter(p -> p.price < 29000) // filtering price
				.map(pm -> pm.price) // fetching price
				.collect(Collectors.toList());
		System.out.println(pricesList);
	}
}
