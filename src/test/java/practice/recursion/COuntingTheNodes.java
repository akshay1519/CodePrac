package practice.recursion;

public class COuntingTheNodes {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(1);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(5);
        root.right.left = new TreeNode(14);
        System.out.println(solve(root));
    }
    public static int solve(TreeNode A) {
        if(A==null)
            return 0;
        solve(A.left);
        solve(A.right);
        if(A.left!= null && A.val<A.left.val) {
            return 0;
        }
        if(A.right!=null && A.val<A.right.val){
            return 1;
        }
        return 1;
    }
}
