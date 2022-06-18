package practice.stackandqueue;

import java.util.Stack;

public class MinStackWIthStack {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> mStack = new Stack<>();
    public static void main(String[] args) {
        push(10);
        push(5);
        push(2);
        pop();
        top();
        getMin();

    }
    public static void push(int x) {
        stack.push(x);
        if (mStack.isEmpty()) {
            mStack.push(x);
        }else if (x<=mStack.peek()) {
            mStack.push(x);
        }
    }

    public static void pop() {
       if (stack.isEmpty())
           return;
       int num = stack.pop();
       if (num==mStack.peek())
           mStack.pop();
    }

    public static int top() {
        if (!stack.isEmpty())
            return stack.peek();
        else
            return -1;
    }

    public static int getMin() {
        if (!mStack.isEmpty())
            return mStack.peek();
        else
            return -1;

    }
}
