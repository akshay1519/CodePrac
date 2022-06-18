package practice.basics;

public class ReverseString {
    public static void main(String[] args) {
        String a = "Abcdsc";
        StringBuilder sb = new StringBuilder();
        char[] ch = a.toCharArray();
        int n = ch.length;
        for (int i=n-1;i>=0;i--){
            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
