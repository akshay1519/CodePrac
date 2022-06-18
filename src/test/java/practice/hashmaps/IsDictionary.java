package practice.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IsDictionary {
    public static void main(String[] args) {
        List<String> A = Arrays.asList("fine", "none", "none");
        String B = "adhbcfegskjlponmirqtxwuvzy";
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 1;
        int o = 1;
        for (char ch:B.toCharArray()){
            map.put(ch,o++);
        }
        for (int i=0;i<A.size()-1;i++){
            if(map.get(A.get(i).charAt(0))<map.get(A.get(i+1).charAt(0))){
                continue;
            }else if(map.get(A.get(i).charAt(0)).equals(map.get(A.get(i+1).charAt(0)))){
                int m = Math.min(A.get(i).length(),A.get(i+1).length());
                int k = 0;
                for (int j=1;j<m;j++){
                    if(map.get(A.get(i).charAt(j))<map.get(A.get(i+1).charAt(j))){
                        break;
                    }else if(map.get(A.get(i).charAt(j))>map.get(A.get(i+1).charAt(j))){
                        ans = 0;
                    }
                    k++;
                }
                if(map.get(A.get(i).charAt(k)).equals(map.get(A.get(i+1).charAt(k)))){
                    if(A.get(i).length()>A.get(i+1).length()){
                        ans = 0;
                    }
                }
            }else {
                ans = 0;
            }
        }
        System.out.println(map);
        System.out.println(ans);
    }
}
