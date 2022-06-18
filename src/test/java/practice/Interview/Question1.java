package practice.Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = null;
        String str2 = null;
        for (int i=0;i<n;i++){
             str1 = sc.next();
             str2 = sc.next();
             if (beautiful(str1, str2)){
                 System.out.println("YES");
             }else {
                 System.out.println("NO");
             }
        }

    }
    public static boolean beautiful(String str1,String str2){
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        if (str1.equals(str2))
            return true;
        else if (str1.length()!=str2.length())
            return false;
        else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            for (int i=0;i<charArray1.length;i++){
                if (map1.containsKey(charArray1[i])){
                    map1.put(charArray1[i],map1.get(charArray1[i])+1);
                }else {
                    map1.put(charArray1[i],1);
                }
            }
            for (int i=0;i<charArray2.length;i++){
                if (map2.containsKey(charArray2[i])){
                    map2.put(charArray2[i],map2.get(charArray2[i])+1);
                }else {
                    map2.put(charArray2[i],1);
                }
            }
            Set<Map.Entry<Character,Integer>> entrySet1 = map1.entrySet();
            Set<Map.Entry<Character,Integer>> entrySet2 = map1.entrySet();

            if (map1.equals(map2))
                return true;
            else
                return false;
        }
    }
}
