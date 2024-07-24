package ExecutorService;

public class TestThread1 implements Runnable {

	public void run() {
		
		System.out.println("Test Thread 1 Start");
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("TestThread1 for : "+i);
		}
		System.out.println("Test Thread 1 End");
	}

}
