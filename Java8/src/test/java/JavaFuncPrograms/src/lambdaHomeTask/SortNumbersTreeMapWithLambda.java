package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.Map;
import java.util.TreeMap;

// . Create a TreeMap that sorts the given set of values in descending order
public class SortNumbersTreeMapWithLambda {
	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<>((I1, I2) -> {
			if (I1 < I2) {
				return +1; 
			}
			else if(I1 > I2) {
				return -1;
			}
			else {
				return 0; 
		    }			
		});
		map.put(5,"Beta");
		map.put(3,"gama");
		map.put(2,"alpha");
		map.put(4,"nexus");
		map.put(1,"pluto");
		System.out.println(map);
	}
}
