package predicateTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
// Home task 3
public class PredicateFunctions {
	static int sum = 0, p = 0;
	static List<Product> list = new ArrayList<Product>();

	public static void main(String args[]) {
		Product product1 = new Product("Mac", 16000, "Battery", "A");
		Product product2 = new Product("UPS", 1600, "Battery", "B");
		Product product3 = new Product("Smartphone", 26000, "Electronics", "C");
		Product product4 = new Product("Bicycle", 800, "Electronics", "D");
		Product product5 = new Product("Watch", 50, "Electronics", "D");
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		costOfAllProducts(list); // total value of all products
		costOfAllProductsOverthousand(list); // total value of all products price over 1000;
		costOfAllElectronicProducts(list); // total value of all electronic products over 1000;
		costOfElectronicProductsPriceOverThousand(list);
	}
	static Function<Integer, Integer> totalPrice = integer -> sum = sum + integer;
	static Function<Integer, Boolean> pricemorethanthousand = integer -> integer > 1000;
	static Function<String, Boolean> electronicProducts = str -> {	return str.equalsIgnoreCase("Electronics");	};
	/************************************************************************************************************************/
	/* 1. Write a function to calculate the cost of all products in a given list of products. */
	public static void costOfAllProducts(List<Product> list1) {
		p = 0; sum = 0;
		for (Product m : list1) {
			p = totalPrice.apply(m.getPrice());
		}
		System.out.println("Sum of all products in list is: " + p); 
	}
	/************************************************************************************************************************/
	 /* 2. Write a function to calculate the cost of all products whose price > 1000/- in the given list of products. */
	 public static void costOfAllProductsOverthousand(List<Product> list1) {
		 p = 0; sum = 0; 
		 for(Product m : list1) { 
			 if(pricemorethanthousand.apply(m.getPrice()))
				 p=totalPrice.apply(m.getPrice()); 
		  }
	      System.out.println("Sum of all products of price more than 1000 in list is: " + p);
	 }         
	 /************************************************************************************************************************/ 
	 /* 3. Write a function to calculate the cost of all electronic products in the given list of products. */
	 public static void costOfAllElectronicProducts(List<Product> list1) { 
		 sum = 0; p = 0; 
		 for(Product m : list1) { 
			 if(electronicProducts.apply(m.getCategory())) 
				 p = totalPrice.apply(m.getPrice()); 
			 } 
		 System.out.println("Sum of Electronic products in list is: " + p); 
	 }
	 /************************************************************************************************************************/
	 /* 4. Write a function to get all the products whose price is > 1000/- and belongs to electronic category. */
	 public static void costOfElectronicProductsPriceOverThousand(List<Product> list1) {
		 sum = 0; p = 0; 
		 for (Product m : list1) {
			 if((pricemorethanthousand.apply(m.getPrice())) && (electronicProducts.apply(m.getCategory()))) 
		         p =  totalPrice.apply(m.getPrice()); 
			} 
		 System.out.println("Sum of Electronic products price over 1000 in list is: " + p); 
	 } 
	 /************************************************************************************************************************/
}
	 
