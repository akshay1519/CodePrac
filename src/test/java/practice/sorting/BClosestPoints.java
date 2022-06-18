package practice.sorting;

import java.util.*;

public class BClosestPoints {
//    public static class mapUtils{
//        public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
//            List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
//            list.sort(Map.Entry.comparingByValue());
//
//            Map<K, V> result = new LinkedHashMap<>();
//            for (Map.Entry<K, V> entry : list) {
//                result.put(entry.getKey(), entry.getValue());
//            }
//
//            return result;
//        }
//    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>(Arrays.asList(-4,2));
        ArrayList<Integer> temp2 = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> temp3 = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> temp4 = new ArrayList<>(Arrays.asList(-2,1));
        ArrayList<Integer> temp5 = new ArrayList<>(Arrays.asList(3,0));
        ArrayList<Integer> temp6 = new ArrayList<>(Arrays.asList(-2,2));
        A.add(temp1);
        A.add(temp2);
        A.add(temp3);
        A.add(temp4);
        A.add(temp5);
        A.add(temp6);
        int B = 3;
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<ArrayList<Integer>>((p1,p2) ->  p2.get(0) * p2.get(0) + p2.get(1) * p2.get(1) - p1.get(0) * p1.get(0) - p1.get(1) * p1.get(1));
        for (ArrayList<Integer> i:A){
            pq.offer(i);
            if (pq.size() >B){
                pq.poll();
            }
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while (B>0){
            res.add(pq.poll());
            B--;
        }
        System.out.println(res);
//        ArrayList<Double> point = new ArrayList<>();
//        System.out.println(A);
//        boolean Comp()
//        Formatter formatter = new Formatter();
//        int B = 1;
//        HashMap<Integer,Double> map = new HashMap<>();
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        int n = A.size();
//        System.out.println(A);
//        for (int i= 0;i<n;i++){
//            long val1 = (long) A.get(i).get(0) * A.get(i).get(0);
//            long val2 = (long) A.get(i).get(1) * A.get(i).get(1);
//            double sqrtTotal = Math.sqrt(val1+val2);
//            map.put(i,sqrtTotal);
//        }
//        ArrayList<Double> t = new ArrayList<>();
//        for (Map.Entry<Integer,Double> entry:map.entrySet()){
//            t.add(entry.getValue());
//        }
//
//        Collections.sort(t);
//        System.out.println(t);
//
//        System.out.println(map);
//        System.out.println(ans);
    }
}
