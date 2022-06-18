package rough;

public interface Demo {
    static final int a = 10;
    int meth1();
    default int beta(){
        beta1();
        return 1;
    }
    default void beta1(){
        System.out.println("Hello");
    }
}
