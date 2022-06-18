package practice.string;

public class LongestPalindrome {
    public static void main(String[] args) {
//        String A = "caccbcbaabacabaccacaaccaccaaccbbcbcbbaacabccbcccbbacbbacbccaccaacaccbbcc";
//        String A = "aaaabaaa";
        String A = "abbcccbbbcaaccbababcbcabca";
        int n = A.length();
        String odd = "";
        String even = " ";
        String oddAns = " ";
        String evenAns = " ";
        int max = 0;
        int s = 0;
        int e = 0;
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<n;i++){
            odd = (palindromeCount(i,i,A));
            oddAns = palindromeIndex(odd);
            int oldMax = max;
            max = Math.max(max, Integer.parseInt(oddAns.split("#")[2]));
            if(max == Integer.parseInt(oddAns.split("#")[2]) && oldMax!=max){
                s = Integer.parseInt(oddAns.split("#")[0]);
                e = Integer.parseInt(oddAns.split("#")[1]);
            }
            even = (palindromeCount(i,i+1,A));
            evenAns = palindromeIndex(even);
            max = Math.max(max, Integer.parseInt(evenAns.split("#")[2]));
            if(max == Integer.parseInt(evenAns.split("#")[2]) && oldMax!=max){
                s = Integer.parseInt(evenAns.split("#")[0]);
                e = Integer.parseInt(evenAns.split("#")[1]);
            }
        }
        for (int i= s+1;i<e;i++){
            ans.append(A.charAt(i));
        }
        System.out.println(ans);
        System.out.println(s);
        System.out.println(e);
        System.out.println(max);
    }
    public static String palindromeCount(int i,int j,String s){
        int n = s.length();
        while (i>=0 && j<n && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return (i)+"#"+(j);
    }
    public static String palindromeIndex(String str){
        StringBuilder sb = new StringBuilder();
        int s = Integer.parseInt(str.split("#")[0]);
        int e = Integer.parseInt(str.split("#")[1]);
        int max = e-s-1;
        sb.append(s+"#"+e+"#"+max);
        return sb.toString();
    }
}
