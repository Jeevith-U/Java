package ExecutorService;

public class TestThread2 implements Runnable {

	public void run() {
		
		System.out.println("Test Thread 2 Start");
		for(int i = 20 ; i <= 30 ; i++) {
			System.out.println("TestThread2 for : "+i);
		}
		System.out.println("Test Thread 2 End");
	}

}
