package lambdaHomeTask;

public class RotationToEachOtherWithoutLambda {

	public static boolean getrotation(String str, String str2) {
		if (str2.length() != str.length())
			return false;
		String temp = str + str;
		if (temp.indexOf(str2) != -1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		/* 3. write a program to check if two strings are rotations of each other. */
		String str = "Hello";
		String str2 = "elloH";
		if (getrotation(str, str2))
			System.out.println("The strings are rotational");
	}
}
