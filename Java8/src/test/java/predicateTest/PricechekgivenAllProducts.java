package predicateTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class PricechekgivenAllProducts {

	/*
	 * Define a predicate to check if the product is of electronics category. Print
	 * all the products from the given list of the products if the product is of
	 * electronics category
	 */
	public static void main(String args[]) {
		Product product1 = new Product("Mac", 16000, "Battery", "A");
		Product product2 = new Product("UPS", 1600, "Battery", "B");
		Product product3 = new Product("Smartphone", 26000, "Electronics", "C");
		Product product4 = new Product("Bicycle", 800, "Electronics", "D");
		Product product5 = new Product("Watch", 50, "Electronics", "D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		Response response1 = new Response("Post",201,"Xml");
		Response response2 = new Response("Get",200,"Json");
		Response response3 = new Response("Delete",400,"Text");
		Response response4 = new Response("Put",400,"Html");
		Response response5 = new Response("Put",400,"Json");
		List<Response> list2 = new ArrayList<Response>();
		list2.add(response1);
		list2.add(response2);
		list2.add(response3);
		list2.add(response4);
		list2.add(response5);
				
		Predicate<Product> predicate_1 = i -> (i.getPrice() > 1000);
		/* Define a predicate to check if the price of given product is greater than 1000/-. 
		 * Print all the products from the given list of the products if the price is greater than 1000/-. */
		System.out.println("The products price more than 1000/- are : ");
		for (Product t : list) {
			if (predicate_1.test(t)) {
				System.out.println(t.name);  // will print the products of price more than 1000 . in this case Mac, UPS, smartphone
			}
		}
		/* Define a predicate to check if the product is of electronics category. 
		 * Print all the products from the given list of the products if the product is of electronics category */
		Predicate<Product> predicate_2 = i -> (i.getCategory().equals("Electronics"));
		System.out.println("The product is of electronics category: ");
		for (Product t : list) {
			if (predicate_2.test(t)) {
				System.out.println(t.name); // will print the products of category "electronics" are Smartphone, Bicycle
			}
		}
		/* Print all the products from the given list of product if the product price is greater than 100/- and
		 * which are in electronics category. */
		Predicate<Product> predicate_3 = i -> (i.getPrice() > 100);
		Predicate<Product> predicate_4 = i -> (i.getCategory().equals("Electronics"));
		System.out.println("The product is of electronics category and price more than 100: ");
		for (Product t : list) {
			if (predicate_3.and(predicate_4).test(t)) {
				System.out.println(t.name); // will print the products of category "electronics" are Smartphone, Bicycle and price more than 100
			}
		}
		/*Print all the products from the given list of product if the product price is greater than 100/- or 
		 * product is in electronics category.*/
		System.out.println("The product is of electronics category or price more than 100: ");
		for (Product t : list) {
			if (predicate_3.or(predicate_4).test(t)) {
				System.out.println(t.name); // will print the products of category "electronics" are Smartphone, Bicycle or price more than 100 Mac, UPS
			}
		}
		/* Define a predicate to check if the status code is 400. 
		 * Print all the responses with status code 400 from the given list of responses. */
		Predicate<Response> predicate_7 = i -> (i.getStatuscode() == 400);
		System.out.println("The response status code is 400: ");
		for (Response t : list2) {
			if (predicate_7.test(t)) {
				System.out.println("responsebody: "+t.responsebody +" & responseCode: "+t.statuscode+" & responsetype: "+t.responsetype); // will print the Responses for status code 400, i.e. put, Delete
			}
		}
		/*Define a predicate to check if the response type JSON. Print all the responses the response type JSON from the given list of responses. */
		Predicate<Response> predicate_8 = i -> (i.getResponsetype().equals("Json"));
		System.out.println("The response response type JSON: ");
		for (Response t : list2) {
			if (predicate_8.test(t)) {
				System.out.println("responsebody: "+t.responsebody +" & responseCode: "+t.statuscode+" & responsetype: "+t.responsetype); // will print the Responses response type JSON, i.e. Get, put
			}
		}
		/*Print all the responses with status code 400 and response type JSON*/
		System.out.println("The response status code is 400: & Response type JSON ");
		for (Response t : list2) {
			if (predicate_7.and(predicate_8).test(t)) {
				System.out.println("responsebody: "+t.responsebody +" & responseCode: "+t.statuscode+" & responsetype: "+t.responsetype); // will print the Responses for status code 400 & JSON i.e. PUT 
			}
		}
		
		/* Print all the responses with status code 400 or response type JSON*/
		System.out.println("The response status code is 400 OR response type JSON");
		for(Response t: list2) {
			if(predicate_7.or(predicate_8).test(t)) {
				System.out.println("responsebody: "+t.responsebody+" & responseCode: "+t.statuscode+" & responsetype: "+t.responsetype); // will print the Responses for status code 400 & JSON i.e.GET,DEL,PUT
			}
		}
		/*Print all the responses with status code is not 400 and response type JSON*/
	System.out.println("The response status code is not 400 and response type JSON");
	for(Response t: list2) {
		if(predicate_7.negate().and(predicate_8).test(t)) 
			System.out.println("responsebody: "+t.responsebody+" & responseCode: "+t.statuscode+" & responsetype: "+t.responsetype); // will print the Responses for status code 400 & JSON i.e.GET,DEL,PUT
		}
	}
}
		