package practice.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] A = {1,2,3,1,2,3,8};
        Map<Integer,Integer> map = new HashMap<>();
        int n = A.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else if(A[i]%4!=0){
                map.put(A[i],1);
            }
        }
        for(int i=0;i<n;i++){
            int temp = A[i]<4?4-A[i]:A[i]%4;
            if(temp != 0 && map.containsKey(temp) && map.get(temp)>0){
                map.put(A[i],map.get(A[i])-1);
                ans++;
                map.put(temp,map.get(temp)-1);
            }
        }
        map.values().removeIf(val -> 0 == val);
        if(map.size()>0){
           ans = -1;
        }
        System.out.println(ans);
    }
}
