package predicateTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;

public class BiFuncHomeTask {

	/* Pre Conditions
	- Define a Product class with name, price, category, grade
	
	  Bi-Function
		1. Given the name and price of the product, write a BiFunction to create a product. 
		2. Given the Product and quantity of the products, write a Bi-Function to calculate the cost of products. 
		   A cart is a map of product and quantity. Given the cart, calculate the cost of the cart.
			Define hashmap for product with quantity,  */
	
	static HashMap<Product, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		Product product1 = new Product("Mac", 16000, "Battery", "A");
		Product product2 = new Product("UPS", 1600, "Battery", "B");
		Product product3 = new Product("Smartphone", 26000, "Electronics", "C");
		Product product4 = new Product("Bicycle", 800, "Electronics", "D");
		Product product5 = new Product("Watch", 50, "Electronics", "D");
		map.put(product1, 20);
		map.put(product2, 05);
		map.put(product3, 10);
		map.put(product4, 22);
		map.put(product5, 20);
		createAProduct("Calculator", 50, "Digital", "E");
		createAProduct("wristBand", 25, "Electronics", "C");
		calculateCostOfProducts(12);
		}		
	
	static BiFunction<Product, Integer, HashMap<Product, Integer>> iCreateAProductUsingBiFunction = (n,b) -> {
		map.put(n, b);
		return map;
	};
	
	static BiFunction<Product, Integer, Integer> iGetCostOfProductWithQuantity = (n,b) -> {
		return (n.getPrice() * b);		
	};
	
	/****************************************************************************************************************************************/
	/* 1. Given the name and price of the product, write a Bi-Function to create a product.*/
	/****************************************************************************************************************************************/
	public static void createAProduct(String ename, int p, String type, String cat ) {
		Product product6 = new Product(ename, p, type, cat);
		if(!map.containsKey(product6))
		  iCreateAProductUsingBiFunction.apply(product6, 02);
		Set <Product>mapi =  map.keySet();
		  for(Product key: mapi) {
			  Set<Entry<Product, Integer>> setv = map.entrySet();
			  System.out.println("Get Key: "+key.getName() +" & Price: " + key.getPrice() + " & category: " + key.getCategory() + " & grade: "+ key.getGrade() + " Get Quantity: " + map.get(key));
		  }
   	}
	
	/****************************************************************************************************************************************/
	// 2. Given the Product and quantity of the products, write a Bi-Function to calculate the cost of products. 
	// A cart is a map of product and quantity. Given the cart, calculate the cost of the cart. 
	/****************************************************************************************************************************************/
	public static void calculateCostOfProducts(int quantity) {
		for(Product pr: map.keySet()) {
			int totalCost = iGetCostOfProductWithQuantity.apply(pr, map.get(pr));
		    System.out.println("Product Name: "+ pr.getName() +" Price is: "+ pr.getPrice() +" Category of: "+ pr.getCategory() +" Grade is:"+ pr.getGrade() +"\n\" Cost for Quantity: \""+ totalCost);
		}
	}
}
