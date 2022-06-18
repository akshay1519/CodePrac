package practice.bitmanipulation;

public class SmallestXOR {
    public static void main(String[] args) {
        int A = 15;
        int B = 2;
        int ans = A;
        int count = 0;
        for (int i = 1;i<=32;i++){
            if(((1<<i)&A)!=0)
                count++;
        }
        while (count<B) {
            for (int i = 1; i <= 32; i++) {
                if (((1 << (i - 1)) & ans) == 0) {
                    ans = 1 << (i - 1) | ans;
                    break;
                }
            }
            count++;
        }
        while (count>B){
            for (int i = 1; i <= 32; i++) {
                if (((1 << (i - 1)) & ans) != 0) {
                    ans = 1 << (i - 1) ^ ans;
                    break;
                }
            }
            count--;
        }
        for (int i = 1; i <= 32; i++) {
            if (((1 << (i - 1)) & ans) == 0)
                System.out.println(i+" Unset");
            else
                System.out.println(i+" Set");
        }
        System.out.println(ans);
    }
}
