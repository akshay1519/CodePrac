package practice.bitmanipulation;

public class ReverseBit {
    public static void main(String[] args) {
        //1100 0000 0000 0000 0000 0000 0000 0000
        long A = 0;
        long ans = 0;
        int pos = 31;
        int aPos = 0;
        while (aPos<32){
            if((A& 1L <<aPos)==0){
                ans = ans | 0<<pos;
            }else
                ans = ans | 1L<<pos;
            aPos++;
            pos--;
        }
        System.out.println(ans);
    }
}
