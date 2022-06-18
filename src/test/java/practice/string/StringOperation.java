package practice.string;

public class StringOperation {
    public static void main(String[] args) {
        String A = "AbcaZeoB";
        StringBuilder con = new StringBuilder();
        con.append(A);
        con.append(A);
        int n = con.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(con.charAt(i)=='a' ||con.charAt(i)=='e' ||con.charAt(i)=='i' ||con.charAt(i)=='o' ||con.charAt(i)=='u'){
                sb.append('#');
            }else if(con.charAt(i)>='a'){
                sb.append(A.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
