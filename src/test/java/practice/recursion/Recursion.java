package practice.recursion;

public class Recursion {
    public static void main(String[] args) {
        String m = "strings";
        System.out.println(palindrome(0,m.length()-1,m));
    }
    static int palindrome(int s,int e,String m){
        if(s>=e){
            return 1;
        }
        if(m.charAt(s)==m.charAt(e)){
            return palindrome(s+1,e-1,m);
        }
        return 0;
    }
}
