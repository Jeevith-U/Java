package ExampleOfLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Lock will break synchronized code into multiple sets of code 
 * Locks in Java provide a powerful and flexible mechanism for managing concurrency and ensuring thread safety, 
 * Advantages of Locks over Synchronization
 */
public class LockImplementation {
	
	private int i = 0;
	
	private int j = 0 ;
	
	Lock lockForI = new ReentrantLock() ;
	Lock lockForJ = new ReentrantLock() ;
	
	synchronized public void incrementI() {
		
		lockForI.lock();//get lock
		i++ ;
		lockForI.unlock();//release lock
	}
	
	public int getI() {
		return i ;
	}
	
	public int getJ() {
		
		return j ;
		
	}
	
	synchronized public void incrementJ() {
		lockForJ.lock();
		j++ ;
		lockForJ.unlock();
	}
}
