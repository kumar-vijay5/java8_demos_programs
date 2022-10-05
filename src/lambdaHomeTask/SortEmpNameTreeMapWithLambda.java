package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// . Create a TreeMap that sorts the given set of employees in descending order of their name
public class SortEmpNameTreeMapWithLambda {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, (i1, i2) -> ((i1.getKey()).compareTo(i2.getKey())));
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("vijay", 1);
		hm.put("Ajay", 2);
		hm.put("Sajan", 3);
		hm.put("Jeevan", 4);
		hm.put("Ravi", 5);
		hm.put("Chandran", 6);
		Map<String, Integer> hm1 = sortByValue(hm);
		for (Map.Entry<String, Integer> en : hm1.entrySet()) {
			System.out.println(en.getKey() + en.getValue());
		}
	}
}
