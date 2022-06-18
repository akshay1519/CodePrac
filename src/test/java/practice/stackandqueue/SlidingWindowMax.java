package practice.stackandqueue;

import java.util.*;

public class SlidingWindowMax {
    public static class Node{
        int value;
        Node next;
        Node prv;
        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prv = null;
        }
    }
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(718, 622, 531, 279, 442, 893, 282, 875, 252, 70, 402, 663, 22, 69, 611, 412, 302, 840, 589, 668, 346, 983, 227, 23, 703, 818, 100, 943, 728, 305, 72, 772, 35, 721, 550, 12, 405, 454, 902, 978, 579);
        int B = 9;
        ArrayList<Integer> ans = slidingMaximum(A,B);
        System.out.println(ans);

    }
    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();
        for (int i=0;i<B;i++){
            if (deque.isEmpty()){
                deque.add(A.get(i));
            }else if(deque.peekLast()<A.get(i)){
                while ( !deque.isEmpty() && deque.peekLast()<A.get(i)){
                    deque.pollLast();
                }
                deque.add(A.get(i));
            }else {
                deque.add(A.get(i));
            }
        }
        ans.add(deque.peekFirst());
        for (int i = 0;i+B<n;i++){
            if (Objects.equals(deque.peekFirst(), A.get(i))){
                deque.pollFirst();
            }
            if (deque.isEmpty()){
                deque.add(A.get(i+B));
            }else if(deque.peekLast()<A.get(i+B)){
                while ( !deque.isEmpty() && deque.peekLast()<A.get(i+B)){
                    deque.pollLast();
                }
                deque.add(A.get(i+B));
            }else {
                deque.add(A.get(i+B));
            }
            ans.add(deque.peekFirst());
        }
        System.out.println(deque);
        System.out.println(ans);
        return ans;
    }
}
