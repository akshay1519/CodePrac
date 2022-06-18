package practice.stackandqueue;

import java.util.*;

public class MaxFreqStack {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> N = new ArrayList<>(Arrays.asList(1,1,1,2,2,1,1,2,2,1,1,1,1,2,2,1,2,1,2,1,1,2,1,1,1,2,1,2,1,1,2,1,2,1,1,2,2,1,1,2,1,1,1,2,2,1,1,1,2,2,1,1,1));
        ArrayList<Integer> M = new ArrayList<>(Arrays.asList(2 , 91, 94, 0 , 0 , 20, 28, 0 , 0 , 8 , 62, 11, 10, 0 , 0 , 84, 0 , 8 , 0 , 79, 9 , 0 , 69, 94, 12, 0 , 19, 0 , 71, 97, 0 , 69, 0 , 44, 64, 0 , 0 , 97, 69, 0 , 21, 2 , 9 , 0 , 0 , 80, 54, 48, 0 , 0 , 95, 45, 67));
        for (int i=0;i<N.size();i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(N.get(i));
            temp.add(M.get(i));
            A.add(temp);
        }
        ArrayList<Integer> ans = solve(A);
        System.out.println(ans);

    }
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();
        for (int i=0;i<n;i++){
            if (A.get(i).get(0)==1){
                int val = A.get(i).get(1);
                st1.push(val);
                map.put(val, map.getOrDefault(val,0)+1);
                ans.add(-1);
            }
            if (A.get(i).get(0)==2){
                int maxFrq = 0;
                for (Map.Entry<Integer,Integer> m:map.entrySet()){
                    if (maxFrq<m.getValue()){
                        maxFrq = m.getValue();
                    }
                }
                Set<Integer> set = new HashSet<>();
                for (Map.Entry<Integer,Integer> m:map.entrySet()){
                    if (maxFrq==m.getValue()){
                        set.add(m.getKey());
                    }
                }
                while (!st1.isEmpty()){
                    if (!set.contains(st1.peek())){
                        st2.push(st1.pop());
                    }else {
                        if (map.get(st1.peek())>1){
                            map.put(st1.peek(),map.get(st1.peek())-1);
                        }else {
                            map.remove(st1.peek());
                        }
                        ans.add(st1.pop());
                        break;
                    }
                }
                while (!st2.isEmpty()){
                    st1.push(st2.pop());
                }
            }
        }
        return ans;
    }
}
