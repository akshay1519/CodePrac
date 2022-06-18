package practice.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountTriangle {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 2));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 2, 1));
        int ans = solve(A,B);
        System.out.println(ans);

    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        long m = 1000000007;
        HashMap<Integer,Integer> mapX = new HashMap<>();
        HashMap<Integer,Integer> mapY = new HashMap<>();
        for (int i=0;i<A.size();i++){
            mapX.put(A.get(i),mapX.getOrDefault(A.get(i),0)+1);
            mapY.put(B.get(i),mapY.getOrDefault(B.get(i),0)+1);
        }
        int res = 0;
        for (int i=0;i<B.size();i++){
            res += ((long) (mapX.get(A.get(i)) - 1) * (mapY.get(B.get(i)) -1)) % m;
        }
        return res;
    }
}
