package rough;

public class InnerClass {
    public class Inner{
        int y = 20;
        void display(){
            System.out.println(y);
        }
    }
    void outerDisplay(){
        Inner i=new Inner();
        i.display();
    }

    public static void main(String[] args) {
        Inner in = new InnerClass().new Inner();
        InnerClass ic = new InnerClass();
        ic.outerDisplay();
    }
}
