package ExecutorService;


public class ExecutorServiceTest1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		TestThread1 thread1 = new TestThread1() ;
		
		Thread thread = new Thread(thread1) ;
		
		thread.start();
		
//		thread.join();
		
		TestThread2 thread2 = new TestThread2() ;
		
		Thread newThread = new Thread(thread2) ;
		
		newThread.start();
		
		TestThread3 thread3 = new TestThread3() ;
		
		thread3.start();
		
	}
}
