package practice.arrays.subarray;

import java.util.*;

public class ConcateThreeInt {
    public static void main(String[] args) {
        int A = 49;
        int B = 14;
        int C = 66;
        List<Integer> arr = Arrays.asList(A,B,C);
        StringBuilder sb = new StringBuilder();
        Collections.sort(arr);
//        int val1 = arr.get(1)-arr.get(0);
//        int val2 = arr.get(2)-arr.get(1);
//        if(val1<=val2){
            for (int i:arr){
                sb.append(i);
            }
//        }else {
//            sb.append(arr.get(1));
//            sb.append(arr.get(2));
//            sb.append(arr.get(0));
//        }
        int ans = Integer.parseInt(sb.toString());
        System.out.println(ans);
    }
}
