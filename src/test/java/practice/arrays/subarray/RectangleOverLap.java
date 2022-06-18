package practice.arrays.subarray;

public class RectangleOverLap {
    static class Point {

        int x, y;
    }
    static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {

        // To check if either rectangle is actually a line
        // For example : l1 ={-1,0} r1={1,1} l2={0,-1} r2={0,1}

        if (l1.x == r1.x || l1.y == r1.y || l2.x == r2.x || l2.y == r2.y)
        {
            // the line cannot have positive overlap
            return false;
        }


        // If one rectangle is on left side of other
        if (l1.x >= r2.x || l2.x >= r1.x) {
            return false;
        }

        // If one rectangle is above other
        if (r1.y >= l2.y || r2.y >= l1.y) {
            return false;
        }

        return true;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Point l1 = new Point(),r1 = new Point(),
                l2 = new Point(),r2 = new Point();
//        l1.x=6;l1.y=3; r1.x=9;r1.y=4;
//        l2.x=2;l2.y=6; r2.x=5;r2.y=10;
        l1.x=0;l1.y=0; r1.x=4;r1.y=4;
        l2.x=2;l2.y=2; r2.x=6;r2.y=6;

        if (doOverlap(l1, r1, l2, r2)) {
            System.out.println("Rectangles Overlap");
        } else {
            System.out.println("Rectangles Don't Overlap");
        }
        System.out.println(solve(l1.x, l1.y, r1.x, r1.y, l2.x, l2.y, r2.x, r2.y));
    }
    public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        int ans = 0;
        if(A==C || B==D || E==G || F==H ){
            ans=1;
        }else if(A>=G || E>=C){
            ans=1;
        }else if(D>=F || H>=B){
            ans=1;
        }
//        ((rec1[2]<=rec2[0]) || (rec1[1]>=rec2[3]) || (rec1[0] >= rec2[2]) || (rec1[3]<=rec2[1]));
        if((C<=E) || (B>=H) || (A >= G) || (D<=F))
            System.out.println("Ans -"+1);
        else
            System.out.println("Ans -"+0);
        return ans;
    }
}
