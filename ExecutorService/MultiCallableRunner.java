package ExecutorService;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiCallableRunner {
	
	public static void main(String[] args) throws InterruptedException {
		
		 ExecutorService executorService = Executors.newFixedThreadPool(2) ;
		 
		 List<CallableTask> tasks = List.of(new CallableTask("Nish"), new CallableTask("Jee"), new CallableTask("Lee")) ;
				 
		 List<Future<String>> values = executorService.invokeAll(tasks) ;
		 
		 values.forEach(value -> {
			try {
				System.out.println(value.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});
	
	}
}
