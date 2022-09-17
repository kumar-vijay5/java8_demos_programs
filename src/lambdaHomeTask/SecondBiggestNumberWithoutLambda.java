package lambdaHomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Find the 2nd biggest number in the given list of numbers without lambda */

public class SecondBiggestNumberWithoutLambda{
	
	public int getexpectedInt(List<Integer> list, int n) {		
	Collections.sort(list);		
	return list.get(list.size()-n);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		int [] ar = {10,8,15,2,22};
		for(int i=0; i<(ar.length);i++) 
			list.add(ar[i]);
		
	SecondBiggestNumberWithoutLambda sec = new SecondBiggestNumberWithoutLambda();
	System.out.println(sec.getexpectedInt(list, 2));
   }
}
