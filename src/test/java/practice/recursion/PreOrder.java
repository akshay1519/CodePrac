package practice.recursion;

import java.util.ArrayList;

public class PreOrder {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        n1.left = new Node(12);
        n1.right = new Node(11);
        ArrayList<Integer> ans = new ArrayList<>();
        ans = preorderTraversal(n1);
        System.out.println(ans);

    }
    public static ArrayList<Integer> preorderTraversal(Node A) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(A!=null)
            ans.add(A.val);
        if(A.left!= null){
            ans.addAll(preorderTraversal(A.left));
        }
        if(A.right!= null){
            ans.addAll(preorderTraversal(A.right));
        }
        return ans;
    }
    public ArrayList<Integer> inorderTraversal(Node A) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(A.left!= null){
            ans.addAll(inorderTraversal(A.left));
        }
        if(A!=null)
            ans.add(A.val);
        if(A.right!= null){
            ans.addAll(inorderTraversal(A.right));
        }
        return ans;
    }
}
