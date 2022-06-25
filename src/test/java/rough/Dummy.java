package rough;

import java.util.Scanner;

public class Dummy {
        static boolean flag = true;
        static Scanner sc = new Scanner(System.in);
        static int B = sc.nextInt();
        static int H = sc.nextInt();

        static{
            try{
                if(B<=0 || H<=0){
                    flag = false;
                }
            }catch(Exception e){
                flag = false;
            }
        }


        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }//end of class

