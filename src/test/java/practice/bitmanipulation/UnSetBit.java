package practice.bitmanipulation;

public class UnSetBit {
    public static void main(String[] args) {
        int n = 21;
        int i = 2;
        if((1<<i & n) == 0) //(n>>i & 1)==0)
            System.out.println(false);
        else
            System.out.println(true);
//        System.out.println(b);
    }
}
