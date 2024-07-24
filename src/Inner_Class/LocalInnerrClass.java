package Inner_Class;

public class LocalInnerrClass {

    public void localInnerClassMethod(){

        class ActualInnerClass{

            public void display(){
                System.out.println("Inner Class Message is Displayed...");
            }
        }
    }

    public static void main(String[] args) {

        LocalInnerrClass aClass = new LocalInnerrClass() ;

    }
}
