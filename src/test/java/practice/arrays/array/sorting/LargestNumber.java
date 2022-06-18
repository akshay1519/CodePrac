package practice.arrays.array.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class LargestNumber {
    public static String largestPrint(ArrayList<Integer> A ){
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int n = A.size();
        for (int i:A){
            ans.add(String.valueOf(i));
        }
        Collections.sort(ans, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a+b;
                String ba = b+a;
                return ab.compareTo(ba)>0?-1:1;
            }
        });
        Iterator<String> it =ans.iterator();
        for (String s:ans){
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
//        Collections.addAll(A,9, 99, 999, 9999, 9998);
        Collections.addAll(A,0,00,000,0000);
        String ans = largestPrint(A);
        boolean flag = false;
        for (int i=0;i<ans.length();i++){
            if (ans.charAt(i)!='0')
                flag = true;
        }
        if(flag == false)
            System.out.println("0");
        System.out.println(ans);
    }
}
