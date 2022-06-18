package practice.intialassesment;

public class Question1 {
    public static void main(String[] args) {
        String A = "abcdefghi";
        char[] ch = A.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<ch.length;i++){
            sb.append(ch[i]);
            sb.append(ch[i]-96);
        }
        System.out.println(sb);
    }
}
