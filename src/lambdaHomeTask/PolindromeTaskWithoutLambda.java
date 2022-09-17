package lambdaHomeTask;

import java.util.Scanner;

/* 1.	Check if a given string is a palindrom without lambda */
public class PolindromeTaskWithoutLambda {
	static String s = "123454321";
	static boolean m = false;

	public static void main(String[] args) {
		int k = s.length() - 1;
		for (int i = 0; i < k; i++) {
			if (s.charAt(i) == s.charAt(k)) {
				k = --k;
				continue;
			} else {
				m = true;
				break;
			}
		}
		if (m)
			System.out.println("This is not polindrom");
		else
			System.out.println("This is a polindrom");

	}
}
