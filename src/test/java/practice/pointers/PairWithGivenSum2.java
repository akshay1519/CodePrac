package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class PairWithGivenSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666));
        int B = 9259332;
        int ans = solve(A,B);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:A){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int i = 0;
        int j = A.size()-1;
        long ans = 0;
        int mod = 1000000007;
        while (i < j){
            int sum = A.get(i)+A.get(j);
            if (sum < B){
                i++;
            }else if(sum > B){
                j--;
            }else {
                if (Objects.equals(A.get(i), A.get(j))){
                    int x = j-i+1;
                    ans = (ans + ((long) x * (x-1)/2)) % mod;
                    break;
                }else {
                    int a = map.get(A.get(i));
                    int b = map.get(A.get(j));
                    ans = (ans + ((long) a * b)%mod) % mod;
                    i += a;
                    j -= b;
                }
            }
        }
        ans %= mod;
        return (int) ans;
    }

    private static int revDuplicateCOunt(ArrayList<Integer> A, Integer val, int ind) {
        int count = 0;
        for (int i=ind;i>=0;i--){
            if (Objects.equals(A.get(i), val)){
                count++;
            }else {
                break;
            }
        }
        return count;
    }

    public static int duplicateCOunt(ArrayList<Integer> A,int val,int ind){
        int count = 0;
        for (int i=ind;i<A.size();i++){
            if (A.get(i)==val){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
