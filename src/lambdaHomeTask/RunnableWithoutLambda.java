package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* . Use Runnable interface to start a new thread and print numbers from  */
public class RunnableWithoutLambda{

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Thread th = new Thread(new Runnable() {			
		@Override
	    public void run() {
	             System.out.println(list);
	    	}
	    });	
		th.start();
	}
	
}