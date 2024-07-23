package ExampleOfLock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * AtomicNumber are suggested for simple operation that have to deal with numbers
 * for complex operation we have to use Locks are suggested.
 * The java.util.concurrent.atomic package in Java provides a set of classes that support lock-free, thread-safe programming on single variables.
 * Non-Blocking: The atomic operations are implemented using low-level concurrency primitives provided by the CPU, ensuring non-blocking behavior.
 */
public class AtomicNumber {
	
	private AtomicInteger i = new AtomicInteger() ;
	
	private AtomicInteger j = new AtomicInteger() ;
	
	
	Lock lockForI = new ReentrantLock() ;
	Lock lockForJ = new ReentrantLock() ;
	
	synchronized public void incrementI() {
		i.incrementAndGet() ;
	}
	
	public int getI() {
		return i.get() ;
	}
	
	public int getJ() {
		
		return j.get() ;
		
	}
	
	synchronized public void incrementJ() {
		j.incrementAndGet() ;
	}
}
