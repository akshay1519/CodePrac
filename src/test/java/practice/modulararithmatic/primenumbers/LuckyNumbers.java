package practice.modulararithmatic.primenumbers;

public class LuckyNumbers {
    public static void main(String[] args) {
        int A = 40;
        int[] spf = new int[A+1];
        int max = A+1;
        int count = 0;

        for (int i = 0;i<max;i++){
            spf[i] = 0;
        }
        for (int i = 2;i<max;i++){
            if(spf[i]==0){
                for (int j = i+i;j<max;j+=i){
                    spf[j] += 1;
                }
            }
        }
        for (int i = 6;i<max;i++){
            if (spf[i]>=2){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
        for (int i = 0;i<max;i++){
            System.out.print(i +" ");
        }
        System.out.println();
        for (int i = 0;i<max;i++){
            System.out.print(spf[i]+" ");
        }
    }
}
