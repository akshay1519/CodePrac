package practice.modulararithmatic.gcd;

public class EnumeratingGCD {
    public static void main(String[] args) {
        String A = "000002052";
        String B = "000002052";
        int n = A.length();
        int m = B.length();
        int indexA = 0;
        int indexB = 0;
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<n;i++){
            if (A.charAt(i)!='0'){
                indexA = i;
                break;
            }
        }
        for (int i=0;i<m;i++){
            if (B.charAt(i)!='0'){
                indexB = i;
                break;
            }
        }
        for (int i = indexA;i<n;i++){
            ans.append(A.charAt(i));
        }
        if(A.equals(B)){
            String abc = ans.toString();
        }
        System.out.println(indexA+" % "+indexB);
        System.out.println(ans);
    }
}
