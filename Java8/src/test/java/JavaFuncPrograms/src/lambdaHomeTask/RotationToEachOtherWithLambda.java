package JavaFuncPrograms.src.lambdaHomeTask;

public class RotationToEachOtherWithLambda {

	public static void main(String[] args) {
		/* 3. write a program to check if two strings are rotations of each other. */
		
		rotationInterface ri = (a,b) -> { 
			if (a.length() != a.length())
				return false;
			String temp = a.concat(a);
			if (temp.indexOf(b) != -1) {
				System.out.println("Strings are rotational");
			} else {
				System.out.println("Strings are not rotational");
			}
			return false;			
		};
		
		ri.rotationCheck("Hello1", "ello1H");
	}
}
