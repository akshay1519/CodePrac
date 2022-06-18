package practice.hashmaps;

import java.util.*;

public class CountRectangle {
    public static void main(String[] args) {

    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int res = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<A.size();i++){
            map.put(A.get(i)+""+B.get(i),map.getOrDefault(A.get(i)+""+B.get(i),0)+1);
        }
        for (int i=0;i<A.size();i++){
            for (int j=i+1;j<B.size();j++){
                if (!A.get(i).equals(A.get(j)) && !B.get(i).equals(B.get(j))){
                    if ((map.containsKey(A.get(i)+""+B.get(j)) && map.get(A.get(i)+""+B.get(j)) == 1) &&
                            map.containsKey(A.get(j)+""+B.get(i)) && map.get(A.get(j)+""+B.get(i)) == 1){
                        res++;
                    }
                }
            }
        }
        return res/2;
    }
}
