package practice.hashmaps;

import java.util.HashSet;

public class ColorfulNumber {
    public static void main(String[] args) {
        int A = 236;
        //Ascii 48-0 to 57-9
        char[] ch = String.valueOf(A).toCharArray();
        int n = ch.length;
        HashSet<Long> map = new HashSet<>();
        long prod = 1;
        for (int i=0;i<n;i++){
            prod = 1;
            for (int j = i;j<n;j++){
                prod *= (ch[j]-48) % (Math.pow(10,9)+7);
                if(map.contains(prod)){
                    return;
                }else {
                    map.add(prod);
                }
            }
        }
        System.out.println(map);

    }
}
