package practice.hashmaps;

import java.util.*;

public class LargestSumSequenceZero {
    public static void main(String[] args) {
//        List<Integer> A = Arrays.asList(1,3,5,-8,2,1,-3,4,1,-1,3,1);
//        List<Integer> A = Arrays.asList(1,3,5,4,-9,-4,2,-2);
//        List<Integer> A = Arrays.asList(1, 2, -3, 3);
        List<Integer> A = Arrays.asList( -8, 8, -1, -16, -28, -27, 15, -14, 14, -27, -5, -6, -25, -11, 28, 29, -3, -25, 17, -25, 4, -20, 2, 1, -17, -10, -25);
        List<Integer> ps = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap();
        int max = 0;
        int prvmax = max;
        String ansInd = " ";
        int sum = 0;
        int zeroInd = 0;
        for (int i : A) {
            sum += i;
            ps.add(sum);
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        for (int i = 0; i < ps.size(); i++) {
            if (ps.get(i) == 0) {
                zeroInd = i;
                max = i + 1;
                ansInd = 0 + "#" + (max - 1);
            }
        }
        for (int i : ps) {
            int s = 0;
            int e = 0;
            if (map.get(i) > 1) {
                s = firstOccurance(ps, map, i);
                e = lastOccurance(ps, map, i);
                map.put(i, 1);
            }
            prvmax = max;
            max = Math.max(max, e - s);
            if (max == e - s && prvmax != max) {
                ansInd = (s + 1) + "#" + e;
            }
        }
        System.out.println(max);
        System.out.println(ansInd);
        System.out.println(map);
        System.out.println(ps);
        System.out.println(ans);
        if (max != 0) {
            int start = Integer.parseInt(ansInd.split("#")[0]);
            int end = Integer.parseInt(ansInd.split("#")[1]);
            for (int i = start; i <= end; i++) {
                ans.add(A.get(i));
            }
        }
        System.out.println(ansInd);
        System.out.println(ans);
    }
    public static int firstOccurance(List<Integer> ps,HashMap<Integer,Integer> map,Integer keyVal) {
        int i = 0;
        while (i < ps.size()) {
            if (Objects.equals(ps.get(i), keyVal))
                break;
            else
                i++;
        }
        return i;
    }
    public static int lastOccurance(List<Integer> ps,HashMap<Integer,Integer> map,Integer keyVal) {
        int j = ps.size()-1;
            while (j>=0){
                if(Objects.equals(ps.get(j), keyVal))
                    break;
                else
                    j--;
            }
        return j;
    }
}
