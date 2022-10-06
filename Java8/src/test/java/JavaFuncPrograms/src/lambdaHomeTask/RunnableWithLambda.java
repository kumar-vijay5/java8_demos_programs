package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* . Use Runnable interface to start a new thread and print numbers from  */
public class RunnableWithLambda{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		runnableIntf rs = () -> {
			Thread th = new Thread();			
			th.start();
			int i = 0;
			while(i < list.size()) {
				try {
					th.sleep(1000);
				    } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    }				
				  System.out.println(list.get(i));
				  i++;
			}
		  	
		};
		rs.run();
	}
}
	
	

