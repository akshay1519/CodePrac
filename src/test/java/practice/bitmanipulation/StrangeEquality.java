package practice.bitmanipulation;

public class StrangeEquality {
    public static void main(String[] args) {
        int A = 5;
        int x = 0;
        int y = 0;
        int bits = (int) (Math.log(A)/Math.log(2)+1);
        for (int i=0;i<bits;i++){
            if ((A&(1<<i))==0)x |= (1<<i);
        }
        y = 1 << bits;
        System.out.println(x^y);
    }
}
