package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.TreeSet;

// Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name
public class SortEmpNamesTreeSetWithLambda {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>((I1, I2) -> {
			if (I1.compareToIgnoreCase(I2) > 0) {
				return +1;
			} else if (I1.compareToIgnoreCase(I2) < 0) {
				return -1;
			} else {
				return 0;
			}
		});
		ts.add("vijay");
		ts.add("ravi");
		ts.add("raju");
		ts.add("phani");
		ts.add("shan");
		// Printing the sorted numbers in reverse order by using TreeSet
		System.out.println(ts);
	
	}
}
