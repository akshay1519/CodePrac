package practice.string;

import java.util.ArrayList;

public class LongestPreFix {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("abcd");
        A.add("abcd");
        A.add("efgh");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int n = A.size();
        StringBuilder sb = new StringBuilder();
        if(n==1) {
            sb.append(A.get(0));
            System.out.println(sb);
            return;
        }else {
            int m = Math.min(A.get(0).length(),A.get(1).length());
            for (int i=0;i<m;i++){
                if(A.get(0).charAt(i)==A.get(1).charAt(i)){
                    sb.append(A.get(0).charAt(i));
                }else {
                    break;
                }
            }
            for (int i=2;i<A.size();i++){
                int min = Math.min(sb.length(),A.get(i).length());
                sb.delete(min,sb.length());
                for (int j=0;j<min;j++){
                    if(sb.charAt(j)!=A.get(i).charAt(j)){
                        sb.delete(j,sb.length());
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
