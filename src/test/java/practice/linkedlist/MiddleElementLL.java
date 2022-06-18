package practice.linkedlist;

public class MiddleElementLL {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(46);
        listNode.next = new ListNode(76);
//        node.next.next = new Node(35);
//        node.next.next.next =  new Node(4);
//        node.next.next.next.next = new Node(5);
//        node.next.next.next.next.next = new Node(6);
        int size = midSize(listNode);
        int ans = solve(listNode);
        System.out.println(ans);
    }
    public static int midSize(ListNode A){
        int count = 0;
        ListNode temp = A;
        if (temp == null){
            return 0;
        }
        while (temp != null){
            count++;
            temp = temp.next;
        }
        if (count%2==0){
            count /= 2;
            count++;
        }else {
            count = count/2;
        }
        return count;
    }
    public static int solve0(ListNode A) {
        int mid = midSize(A);
        ListNode temp = A;
        int ans = 0;
        while (mid>0){
            mid--;
            temp = temp.next;
        }
        ans = temp.val;
        return ans;
    }
    public static int solve(ListNode A) {
        if (A == null){
            return 0;
        }
        ListNode fast = A;
        ListNode slow = A;
        while (fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
