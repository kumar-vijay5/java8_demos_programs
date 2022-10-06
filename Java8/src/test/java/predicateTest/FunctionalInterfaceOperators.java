package predicateTest;

import java.util.function.DoubleSupplier;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
/*Pre-Conditions
- Define a Product class with name, price, category, grade */

public class FunctionalInterfaceOperators {
	
	public static void main(String args[]) {
		checkIfPrime();
		checkSquareRoot();
		checkRandomNumber();
	}

	/******************************************************************************************************/
    /*1. Write an IntPredicate to verify if the given number is a Prime number*/
	public static void checkIfPrime() {
		int[] ar = { 2, 3, 5, 6, 9, 11, 13, 16, 18, 19, 21, 23, 24, 27, 29, 30, 31, 33, 37 };
		for (int a : ar)
			System.out.println(a + " Is the number is Prime: " + verifyAPrimenumber.test(a));			
	}
		
	/******************************************************************************************************/
	/*2. Write an IntConsumer to print square of the given number*/
	public static void checkSquareRoot() {
		int[] ar = { 2, 3, 5, 6, 9, 11, 13, 16, 18, 19, 21, 23, 24, 27, 29, 30, 31, 33, 37 };
		for (int a : ar)
			verifyASquareroot.accept(a);
	}
	
	/*****************************************************************************************************/
	/*3. Write a IntSupplier to give random int below 5000. */
	public static void checkRandomNumber() {
		int[] ar = { 250, 35000, 5001, 600, 9001, 1100, 13002};
		System.out.println(" to get Random number " + verifyARandomnumber.getAsInt());		
	}
	
	/*****************************************************************************************************/	
	/* intSupplier to find random number*/
	static IntSupplier verifyARandomnumber = () -> {
		int i = (int) (Math.random() * 4999);
			return i;
	};
	
	/* intConsumer to find square root */
	static LongConsumer verifyASquareroot = (i) -> {
		System.out.println(i + " the square root of number is: "+ (i * i));
	};
	
	/* intPredicate to find prime number */
	static IntPredicate verifyAPrimenumber = (i) -> {
		int n = 2;
		boolean b = true;
		while (n < i / 2) {
			if (i % n == 0) {
				b = false;
				break;
			}
			n++;
		}
		return b;
	};
}
