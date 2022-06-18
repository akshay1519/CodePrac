package practice.Interview;

import java.io.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int L = Integer.parseInt(line[0]);
            int R = Integer.parseInt(line[1]);

            int out_ = palPrime(L, R);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int palPrime(int L, int R){
        int num = 0;
        int count = 0;
        for(int i=L;i<=R;i++){
            boolean flag = false;
            if(i==2){
                count++;
            }
            else
                num = i;
            for(int j=2;j<i;j++){
                if(i%j!=0){
                    flag = true;
                }else{
                    flag = false;
                        break;
                }
            }
            if(flag==true && num==reverse(num)){
                count++;
            }
        }

        return count;
    }

    static int reverse(int a){
        int rev = 0;
        while(a>0){
            rev = rev*10+(a%10);
            a /= 10;
        }
        return rev;
    }
}