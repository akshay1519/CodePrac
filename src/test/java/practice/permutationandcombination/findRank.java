package practice.permutationandcombination;

public class findRank {
    public static void main(String[] args) {
        String A = "gTFAMYjxCewRlftmGOKJHUuhSBVDZnbqyoPQadEkLrpNsv";
        int n = A.length()-1;
        long rank=0;
        for(int i=0 ;i<A.length()-1;i++){
            int count=0;
            for(int j = i+1;j<A.length();j++){
                if(A.charAt(i)>A.charAt(j))
                    count++;
            }
            if(count>0)
                rank=rank+((fact(n)%1000003)*(count%1000003))%1000003;
            n = n-1;
        }
        System.out.println((rank+1)%1000003);
    }
    public static long fact(int n){
        if(n<=1)
            return 1;
        return n * fact(n-1)%1000003;
    }
}
