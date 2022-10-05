package predicateTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class HomeTask4PredefinedFunctions {

	/* Pre Conditions
	- Define a Product class with name, price, category, grade */	
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
		printProductName();
		upgradeToPremium();
		updateSuffixToName();
		premiumGradeWithSuffixToName();
		getNameUsingsupplier();
		getOTPUsingsupplier();
	}
	
	static Function<Integer, Boolean> priceOfProductOverOneThousand = integer -> integer > 1000;
	static Function<Integer, Boolean> priceOfProductOverThreeThousand = integer -> integer > 3000;
	static Consumer<Product> productName = product -> {System.out.println("Name of Product is: "+product.getName());};
	static Consumer<Product> productCategory = product -> {System.out.println("Category of product is: "+product.getCategory());};
	static Consumer<Product> updateToPremiumGrade = product -> {
		product.setGrade("Premium");
		System.out.println("\""+product.getGrade()+"\" grade updated on product is: \""+product.getName()+"\"");
	};
	static Consumer<Product> suffixproductName = product -> {
		product.setName("*".concat(product.getName()));
		System.out.println("add suffix on Name of Product is: "+product.getName());
	};
	static Function<String, Boolean> productOfPremiumGrade = str -> str.equalsIgnoreCase("Premium");
	static Consumer<Product> premiumProductWithSuffix = product -> {
		if(product.getName().startsWith("*")) {
		System.out.println("Premium product with Suffix* :"+product.getName());
		}
	};
	static Supplier<String> getRandomNameUsingsupplier = () -> { 
		int i = (int) (Math.random() * 5);
		return(list.get(i).getName());			
	};
	static Supplier<Integer> getRandomOTPUsingsupplier = () -> { 
		return (int) (Math.random() * 51234);
	};
	
	
	/************************************************************************************************************************************/
	/* 1. Given a product write a consumer to print the product to appropriate medium depending on the print parameter. 
          If the print parameter is set to file, consumer shall log the product to file, if not print on the console. */	
	public static void printProductName() {
			for(Product rm: list)
				productName.accept(rm);		
	}
    /************************************************************************************************************************************/	
	/*2. Write a Consumer to update the grade of the product as 'Premium' if the price is > 1000/-. 
	     Given the product list, update the grade for each product and print all of the products.*/
   	public static void upgradeToPremium() {
		for(Product rm: list)
			if(priceOfProductOverOneThousand.apply(rm.getPrice())) {
				updateToPremiumGrade.accept(rm);
			}
	}
   	/************************************************************************************************************************************/
   	/*3. Write a Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-. 
   	 * Given the product list, update the name for each product and print all of the products. */
   	public static void updateSuffixToName() {
		for(Product rm: list)
			if(priceOfProductOverThreeThousand.apply(rm.getPrice())) {
				suffixproductName.accept(rm);
			}
   	}
   	/************************************************************************************************************************************/
   	/*4. Print all the Premium grade products with name suffixed with '*'.*/
	public static void premiumGradeWithSuffixToName() {
		for(Product rm: list)
			if(productOfPremiumGrade.apply(rm.getGrade())) {
				premiumProductWithSuffix.accept(rm);
			}
   	}
	/************************************************************************************************************************************/
	/*1. Write a supplier to produce a random product. */
	public static void getNameUsingsupplier( ) {		
		System.out.println(getRandomNameUsingsupplier.get());
	}
	
	/************************************************************************************************************************************/
	/*2. Write a supplier to produce a random OTP. */
	public static void getOTPUsingsupplier( ) {		
		System.out.println(getRandomOTPUsingsupplier.get());
	}
}
