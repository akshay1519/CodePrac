package practice.linkedlist;

public class ReverseLL2 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
//        listNode.next.next.next =  new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);
        System.out.println(llSize(listNode));
        reverseBetween(listNode,2,3);
        System.out.println(llSize(listNode));
        print(listNode);

    }
    public static ListNode reverseBetween(ListNode A, int B, int C) {
        int len = llSize(A);
        if (B > C || len<B){
            return A;
        }
        ListNode curr = A;
        int tempB = B;
        while (curr != null || tempB>0){
            curr = curr.next;
            tempB--;
        }
        ListNode prv = null;
        ListNode nxt = null;
        B++;
        while (curr != null || B<C){
            B++;
            nxt = curr.next;
            curr.next = prv;
            prv = curr;
            curr = nxt;

        }
        prv = curr;
        return A;
    }

    public static int llSize(ListNode A){
        int count = 0;
        ListNode temp = A;
        if (temp==null){
            return count;
        }
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void print(ListNode A){
        ListNode temp = A;
        while (temp != null){
            System.out.print(A.val+" ");
            temp = temp.next;
        }
    }
}
