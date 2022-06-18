package practice.basics;

public class Palindrome {
    public static void main(String[] args) {
        String a = "AbcbD";
        char[] ch = a.toCharArray();
        int n = a.length()-1;
        int i =0;
        boolean flag = false;
        while (i < n){
            if (ch[i++] == ch[n--]){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
