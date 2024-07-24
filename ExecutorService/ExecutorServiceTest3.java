package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest3 {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor() ;
		
		executorService.execute(new TestThread1());
		
		executorService.execute(new Thread(new TestThread2()));
		
		executorService.shutdown();
	}
}
