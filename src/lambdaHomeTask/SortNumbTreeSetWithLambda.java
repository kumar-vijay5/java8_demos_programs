package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.Iterator;
import java.util.TreeSet;

// Create a TreeSet that sorts the given set of numbers in reverse order
public class SortNumbTreeSetWithLambda {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(110);
		set.add(35);
		set.add(55);
		set.add(125);
		set.add(10);
		TreeSortIntf isi = () -> {
			Iterator<Integer> i = set.descendingIterator();
			while (i.hasNext()) 
				System.out.println(i.next());
		};		
		isi.sortReverse();
	}
}
