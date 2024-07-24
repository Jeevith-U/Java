package ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * The callable interface makes the class to return a value
 */

class CallableTask implements Callable<String>{
	
	private String name ;
	
	public CallableTask(String name) {
		 this.name = name ;
	}

	public String call() throws Exception {
		Thread.sleep(3000);
		return "Hello "+this.name;
	} 
	
}

public class CallableRunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 ExecutorService executorService = Executors.newFixedThreadPool(2) ;
		 
		 /*
		  * Executor Service.submit() Helpps to submit a value returning from the Callable 
		  * it return future Data type means it wont guaranty that it will return
		  */
		 
		 
		 Future<String> value = executorService.submit(new CallableTask("Jeevith")) ;
		 
		 System.out.println("Some Message"); // this will run on a different thread
		 
		 String valueMsg = value.get(); 
		 
		 System.out.println(valueMsg);
		 
		 System.out.println("Main Completed...!");
	}
	
}
