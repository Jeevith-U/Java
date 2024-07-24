package ExecutorService;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiAnyCallableRunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 ExecutorService executorService = Executors.newFixedThreadPool(2) ;
		 
		 List<CallableTask> tasks = List.of(new CallableTask("Nish"), new CallableTask("Jee"), new CallableTask("Lee")) ;
		  /*
		   * Invoke any return the out put once after its done
		   */
		  String values = executorService.invokeAny(tasks) ;
		 
		  System.out.println(values);
	
	}
}
