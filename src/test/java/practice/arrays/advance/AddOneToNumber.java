package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOneToNumber {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(9, 9, 9, 9, 9);
        int n = A.size();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbAns;
        ArrayList<Integer> ansList = new ArrayList<>();
        for (int i : A) {
            sb.append(i);
        }
        int i = sb.length() - 1;
        int carry = 0;
        while (i >= 0) {
            int val = Integer.parseInt(String.valueOf(sb.charAt(i))) + 1;
            if (val > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
            sb.replace(i, i + 1, String.valueOf(val % 10));
            i--;
            if (carry != 0) {
                continue;
            } else {
                break;
            }
        }
        if(carry==1){
            sb.append(1);
            sb.reverse();
        }
        boolean flag = false;
        for (int j = 0; j < sb.length(); j++) {
            int val = Integer.parseInt(String.valueOf(sb.charAt(j)));
            if (!flag && val > 0) {
                flag = true;
            }
            if (flag) {
                ansList.add(Integer.parseInt(String.valueOf(sb.charAt(j))));
            }
        }
        System.out.println(ansList);
    }
}
