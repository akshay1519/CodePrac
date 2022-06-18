package practice.linkedlist;

public class Linkedlist {
    static class Node{
        int data;
        Node next;
        public Node(int a){
            this.data=a;
            this.next=null;
        }
    };

    static Node head=null;
    static Node temp=null;

    public static void insert_node(int position, int value) {
        if(position==1){
            Node newNode=new Node(value);
            if(head != null){
                newNode.next=head;
            }
            head=newNode;
            return;
        }
        Node newNode=new Node(value);
        temp=head;
        int c=0;
        while(temp!=null && c<position-2){
            c++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void delete_node(int position) {
// @params position, integer
        if(position==1){
            if(head!=null){
                head=head.next;
                return;
            }
        }
        temp=head;
        int c=0;
        while(temp!=null && c<position-2){
            c++;
            temp=temp.next;
        }
        if(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
        }
    }

    public static void print_ll() {
// Output each element followed by a space
        Node current=head;
        while(current!=null){
            System.out.print(current.data);
            if(current.next!=null){
                System.out.print(" ");
            }
            current=current.next;
        }
    }
}
