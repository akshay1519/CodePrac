package practice.string;

import java.util.HashMap;
import java.util.Map;

public class PermutationAinB {
    public static void main(String[] args) {
        String A = "ebbp";
        String B = "qaoedpcebeaqocbacoccqoebpqdoqcpbdbqcecdoqcpebqpebbabqdpepcpbqbepbabocpc";
        int ans = solve(A,B);
        System.out.println(ans);

    }
    public static int solve(String A, String B) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map1 = new HashMap<>();
        int m = A.length();
        int n = B.length();
        int ans = 0;
        for (int i= 0;i<m;i++){
            char curr = A.charAt(i);
            if (map1.containsKey(curr)){
                map1.put(curr,map1.get(curr)+1);
            }else {
                map1.put(curr,1);
            }
        }
        for (int i=0;i<m-1;i++){
            char curr = B.charAt(i);
            if (map.containsKey(curr)){
                map.put(curr,map.get(curr)+1);
            }else {
                map.put(curr,1);
            }
        }
        int k = 0;
        for (int i=m-1;i<n;i++){
            char curr = B.charAt(i);
              if (map.containsKey(curr)){
                map.put(curr,map.get(curr)+1);
            }else {
                map.put(curr,1);
            }
            boolean flag = true;
              for (Map.Entry<Character,Integer> m1:map1.entrySet()){
                  if (m1.getValue().equals(map.get(m1.getKey()))){
                      continue;
                  }
                  else {
                      flag = false;
                      break;
                  }
              }
//            for (int j = 0;j<m;j++){
//                if (map.containsKey(A.charAt(j)) && map.get(A.charAt(j))>0){
//                    continue;
//                }else {
//                    flag = false;
//                    break;
//                }
//            }
            if (flag){
                ans++;
            }
            if (map.containsKey(B.charAt(k)) && map.get(B.charAt(k))>1){
                map.put(B.charAt(k),map.get(B.charAt(k))-1);
            }else {
                map.remove(B.charAt(k));
            }
            k++;
        }
        return ans;
    }
}
