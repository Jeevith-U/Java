package Inner_Class;

/**
 * @author Jeevith
 *
 * Jeevith
 * 
 * Inner class can access the outer class member. But outer class cannot have since inner dress remember. 
 */
public class TestNestedClass {
	
	int x = 100 ;
	
	class TestClass{
		
		int y = 200 ;
		
		public void innerDisplay() {
			
			System.out.println("From Inner : "+x);
			System.out.println("From Inner : "+y);
		}
	}
	
	public void outerDisplay() {
		
		System.out.println("From Outer : "+x);
		System.out.println("From Outer : "+new TestClass().y);
	}
	
	public void display() {
		System.out.println(x);
		TestClass inner = new TestClass() ;// we can create the object of inner class inside the Method
		inner.innerDisplay();
	}
	
	public static void main(String[] args) {
		
		TestNestedClass outer = new TestNestedClass() ;
		TestClass inner = outer.new TestClass() ; // To create the Object Of inner Class
		
		outer.display();
		
//		outer.outerDisplay();
//		inner.innerDisplay();
	}
	
}
