package lambdaHomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Find the second biggest number in the given list of numbers with lambda */
class SecondBiggestNumberWithLambda {
	public static void main(String[] args) {
		SecondBigNumb sec = (n) -> {
			List<Integer> list = new ArrayList();
			int[] ar = { 10, 8, 15, 2, 22 };
			for (int i = 0; i < (ar.length); i++)
				list.add(ar[i]);
			    Collections.sort(list);
			System.out.println("This is the sorting order"+list);
			System.out.println("This second biggest number"+list.get(list.size()-n));
		};
		sec.findSecondBigNumb(2);
	}
}

