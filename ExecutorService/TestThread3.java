package ExecutorService;

public class TestThread3 extends Thread {

	public void run() {
		
		System.out.println("Test Thread 3 Start");
		for(int i = 30 ; i <= 40 ; i++) {
			System.out.println("TestThread3 for : "+i);
		}
		System.out.println("Test Thread 3 End");
	}
	
}
