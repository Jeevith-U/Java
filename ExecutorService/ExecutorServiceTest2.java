package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest2 {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2) ;
		
		executorService.execute(new TestThread1());
		
		executorService.execute(new Thread(new TestThread2()));
		
		executorService.shutdown();
	}
}
