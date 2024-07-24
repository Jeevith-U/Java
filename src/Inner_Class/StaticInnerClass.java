package Inner_Class;

public class StaticInnerClass {

    static int x = 10 ;

    int y = 20 ;

    static class InnerClass{

        void displayAttribute(){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        StaticInnerClass.InnerClass  obj =  new StaticInnerClass.InnerClass() ;

        obj.displayAttribute();
    }
}
