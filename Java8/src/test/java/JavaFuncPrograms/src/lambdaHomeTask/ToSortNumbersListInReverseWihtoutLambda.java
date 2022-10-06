package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToSortNumbersListInReverseWihtoutLambda {

		public static void main(String[]  args) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(110);
			list.add(35);
			list.add(55);
			list.add(125);
			list.add(10);
			Comparator cm = Collections.reverseOrder();		
			Collections.sort(list,cm);	
			System.out.println(list);
		}
		
		  public int compare(int o1, int o2) { 
			  if( o1 > o2) 
				  return -1; 
			  if (o1 < o2)
		          return 1; 
			  if(o1 == o2) return 0; return 0; 
		}
		 	 
}

