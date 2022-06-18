package practice.arrays.subarray;

import java.util.Arrays;
import java.util.List;

public class NByThreeRepeatNo {
    public static void main(String[] args) {
//        List<Integer> a = Arrays.asList(1000727, 1000727, 1000641, 1000517, 1000212, 1000532, 1000727, 1001000, 1000254, 1000106, 1000405, 1000100, 1000736, 1000727, 1000727, 1000787, 1000105, 1000713, 1000727, 1000333, 1000069, 1000727, 1000877, 1000222, 1000727, 1000505, 1000641, 1000533, 1000727, 1000727, 1000727, 1000508, 1000475, 1000727, 1000573, 1000727, 1000618, 1000727, 1000309, 1000486, 1000792, 1000727, 1000727, 1000426, 1000547, 1000727, 1000972, 1000575, 1000303, 1000727, 1000533, 1000669, 1000489, 1000727, 1000329, 1000727, 1000050, 1000209, 1000109);
        List<Integer>a = Arrays.asList(1000441, 1000441, 1000994);
        int n = a.size();
        System.out.println(n);
        Integer maj1 = Integer.MIN_VALUE;
        Integer maj2 = Integer.MAX_VALUE;
        int freq1 = 0;
        int freq2 = 0;
        int ans = -1;
        for (int i=0;i<n;i++) {
            if(maj1.equals(a.get(i)))
                freq1++;
            else if(maj2.equals(a.get(i)))
                freq2++;
            else if(freq1==0) {
                freq1++;
                maj1=a.get(i);
            }else if(freq2==0) {
                freq2++;
                maj2=a.get(i);
            }else {
                freq1--;
                freq2--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for (Integer integer : a) {
            if (maj1 != null && maj1.equals(integer)) {
                count1++;
            } else if (maj2 != null && maj2.equals(integer)) {
                count2++;
            }
        }
        ans = Math.max(count1,count2);
        if(count1>n/3)
            ans = maj1;
        else if(count2>n/3)
               ans = maj2;
        System.out.println(ans);
    }
}
