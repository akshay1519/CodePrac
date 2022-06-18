package practice.linkedlist;

public class KReverseLL {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(6);
        listNode.next = new ListNode(10);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next =  new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(8);

        listNode = reverseList(listNode,3);
        print(listNode);

    }
    public static ListNode reverseList(ListNode A, int B,ListNode newHead) {
        if (A == null || B <-1)
            return A;
        ListNode h2 = null;
        while (newHead!= null && B>0){
            ListNode temp = newHead;
            newHead = newHead.next;
            temp.next = h2;
            h2 = temp;
            B--;
        }
        A.next = newHead;
        return h2;
    }
    public static ListNode reverseList(ListNode A, int B) {
       if (A == null)
           return A;
       ListNode prv = null;
       ListNode curr = A;
       ListNode nxt = null;
       int count = 0;
       while (curr != null && B>0){
           nxt = curr.next;
           curr.next = prv;
           prv = curr;
           curr = nxt;
           count++;
       }
       if (nxt == null){
           A.next = reverseList(curr,B);
       }
       return prv;
    }

    public static void print(ListNode A){
        ListNode temp = A;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
