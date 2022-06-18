package practice.recursion;

public class KthSymbol {
    public static void main(String[] args) {
        int A = 9;
        int B = 175;
//        int A = 5;
//        int B = 5;
        StringBuilder sb = new StringBuilder();
        String ans = kthString(A,sb);
        System.out.println(ans);
        System.out.println(ans.charAt(B-1)-48);
    }
    public static String kthString(int a,StringBuilder sb) {
        if (a == 0) {
            sb.append("0110");
            return sb.toString();
        }
        kthString(a-1,sb);
        int current = sb.length();
        for (int i=0;i<current;i++){
            if(sb.charAt(i)=='0')
                sb.append('1');
            else
                sb.append('0');
        }
        return sb.toString();
    }

    // Actual Solution
    public int solve(int A, int B) {
        return solveQ(A, B) ? 1 : 0;
    }
    static boolean solveQ(int n, int k) {

        if (n == 1 && k == 1)
            return false;

        int mid = (int) Math.pow(2, n - 1) / 2;

        if (k <= mid)
            return solveQ(n - 1, k);
        else
            return !solveQ(n - 1, k - mid);
    }
}
