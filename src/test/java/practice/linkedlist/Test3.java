package practice.linkedlist;

public class Test3 {
    //
//      Definition for binary tree
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
//        TreeNode A = new TreeNode(23456735);
        TreeNode A = new TreeNode(40);
        A.left = new TreeNode(35);
        A.right = new TreeNode(41);
        A.left.left = new TreeNode(34);
        A.left.right = new TreeNode(37);
        A.right.right = new TreeNode(46);
        A.left.left.left = new TreeNode(31);
        A.left.left.left.left = new TreeNode(29);
        A.left.left.left.left = new TreeNode(29);
        int ans = isValidBST(A);
        System.out.println(ans);
    }

    static int max = Integer.MIN_VALUE;

    public static int isValidBSTAns(TreeNode A) {
        if(A == null)
            return 0;
        int max1 = A.val;
        if((A.left != null && max1<A.left.val) || (A.right !=null && max1>A.right.val)){
            return 1;
        }
        int leftS =  isValidBSTAns(A.left);
        int rightS =  isValidBSTAns(A.right);
        return Math.max(leftS,rightS);
    }
    public static int isValidBST(TreeNode A) {
        if(A == null)
            return 0;
        if(A.left==null && A.right == null)
            return 1;
        else
            return isValidBSTAns(A);
    }
}
