package practice.Interview;

import java.util.Scanner;

public class FavouriteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int m = sc.nextInt();
            System.out.println(favouriteNumberCOunt(m));
        }
    }

    private static int favouriteNumberCOunt(int m) {
        int count  = 0;
        int currentNum = 0;
        while (m>0){
            currentNum = m%10;
            if (currentNum==5){
                count++;
            }
            m /= 10;
        }
        return count;
    }
}
