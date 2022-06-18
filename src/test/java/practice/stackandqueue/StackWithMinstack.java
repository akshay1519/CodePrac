package practice.stackandqueue;

import java.util.ArrayList;
import java.util.List;

public class StackWithMinstack {

    static int N = (int) (Math.pow(10,7)+1);
    static List<Integer> rStack = new ArrayList<>();
    static List<Integer> minStack = new ArrayList<>();
    static int msTop = -1;
    static int top = -1;
    public static void main(String[] args) {
//        19 P 10 P 9 g P 8 g P 7 g P 6 g p g p g p g p g p g
        push(664656564);
        pop();
        push(743456789);
        push(8765423);
        System.out.println(getMin());
        System.out.println(top());
    }
    public static void push(int x) {
        rStack.add(x);
        top++;
        if(msTop<0){
            minStack.add(x);
            msTop++;
        }else if(x <= minStack.get(msTop)){
            minStack.add(x);
            msTop++;
        }

    }

    public static void pop() {
        if(top<0)
            return;
        int num = rStack.get(top);
        rStack.remove(top--);
        if(num == minStack.get(msTop))
            minStack.remove(msTop--);
    }

    public static int top() {
        if(top>=0)
            return rStack.get(top);
        else
            return -1;
    }

    public static int getMin() {
        if (msTop>=0)
            return minStack.get(msTop);
        else
            return -1;
    }
}
