package practice.contest;

import java.util.ArrayList;
import java.util.Arrays;

public class LittlePonny {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3,5,6,1));
        int n = (int) Math.pow(2,32);
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){

            }
        }









//        int n = A.size();
//        int maxAnd = 0;
//        int maxOr = 0;
//        for (int i=0;i<n;i++){
//            int currAnd = A.get(i);
//            int currOr = A.get(i);
//            for (int j=i+1;j<n;j++){
//                currAnd = currAnd & A.get(j);
//                currOr = currOr | A.get(j);
//                  if (maxAnd<currAnd){
//                      maxAnd = currAnd;
//                  }if (maxOr<currOr){
//                      maxOr = currOr;
//                }
//                System.out.print(currAnd+" ");
//            }
//        }
//        System.out.println();
//        System.out.println(maxAnd);
//        System.out.println(maxOr);
//        System.out.println(maxAnd+maxOr);
    }
}
