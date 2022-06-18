package practice.linkedlist;

public class Test2 {
    public static void main(String[] args) {
        String A = "aaaaa";
        int B = 1;
        StringBuilder sb = new StringBuilder(A);
        int n = A.length();
        boolean flag = false;
        int i = 0;
        while (sb.length()>0 && i<sb.length()-1){
            flag = false;
            if(sb.charAt(i)==sb.charAt(i+1)) {
                char currChar = sb.charAt(i);
                int count = 0;
                int j = i;
                if (j + B < sb.length()) {
                    for (; j <= j+B; j++) {
                        if (currChar == sb.charAt(j)) {
                            count++;
                        } else {
                            break;
                        }
                        if (count == B) {
                            flag = true;
                            sb.delete(i, j + 1);
                            i = -1;
                            break;
                        }
                    }
                }
            }
        i++;
        if(i==n-1 && !flag)
            break;
        }
        if(B==1)
            sb.delete(0,sb.length());
        System.out.println(sb);
    }
}
