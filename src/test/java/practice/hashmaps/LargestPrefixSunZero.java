package practice.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestPrefixSunZero {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-8, 8, -1, -16, -28, -27, 15, -14, 14, -27, -5, -6, -25, -11, 28, 29, -3, -25, 17, -25, 4, -20, 2, 1, -17, -10, -25));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 13, -1, 8, 29, 1, 24, 8, 21, 20, 21, -23, -21, 0));
        ArrayList<Integer> ans = lszero(A);
        System.out.println(ans);
    }
    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] ansInd = new int[2];
        int n = A.size();
        int sum = 0;
        boolean flag = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<n;i++){
            sum += A.get(i);
            if (map.containsKey(sum)){
                int temp = i+2-map.get(sum);
//                if (ansInd[0] == 0 && flag){
//                    temp -= 1;
//                }
                flag = true;
                if (temp>ansInd[1]-ansInd[0]) {
                    ansInd[1] = i+2;
                    if (sum == 0) {
                        ansInd[0] = 1;
                    } else {
                        ansInd[0] = map.get(sum);
                    }
                }

            }else {
                map.put(sum,i+2);
            }
        }
        System.out.println(ansInd[0] + " "+ansInd[1]);
        if (flag) {
            for (int i = ansInd[0]-1; i < ansInd[1]-1; i++) {
                ans.add(A.get(i));
            }
        }
        return ans;
    }
}
