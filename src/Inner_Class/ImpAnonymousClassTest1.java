package Inner_Class;

public class ImpAnonymousClassTest1 {

    public void createAnonymousClass(){

        AnonymousClassTest1 obj = new AnonymousClassTest1() {
            @Override
            public void testAbstractMethod1() {
                System.out.println("Some Implementation For The Method");
            }
        } ;

        obj.testAbstractMethod1();
    }

    public static void main(String[] args) {

        ImpAnonymousClassTest1 obj = new ImpAnonymousClassTest1() ;

        obj.createAnonymousClass();
    }

}
