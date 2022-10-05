package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Use Comparator interface to sort given list of Employees in the alphabetic order of their name
public class SortEmpNamesListWithLambdaWithRunner {
	public static void main(String args[]) {
		List<SortEmpNamesListWithLambda> empNames = new ArrayList<>();
		empNames.add(new SortEmpNamesListWithLambda("vijay", 10));
		empNames.add(new SortEmpNamesListWithLambda("djay", 02));
		empNames.add(new SortEmpNamesListWithLambda("wijay", 30));
		empNames.add(new SortEmpNamesListWithLambda("kijay", 04));
		empNames.add(new SortEmpNamesListWithLambda("aijay", 05));
		System.out.println(empNames);
		
		Comparator<SortEmpNamesListWithLambda> cm = (obj1,obj2 ) -> {
			if(obj1.getName().charAt(0) < obj2.getName().charAt(0))
                return -1;
			else if(obj1.getName().charAt(0) > obj2.getName().charAt(0))
                return 1;
			else
                return 0;
		};
		Collections.sort(empNames, cm);
		System.out.println(empNames);
		// Using comparable compareTo
		Collections.sort(empNames);
	}
		
	
}