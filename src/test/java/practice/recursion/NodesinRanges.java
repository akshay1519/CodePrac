package practice.recursion;

public class NodesinRanges {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(17);
            root.left = new TreeNode(32);
            root.right = new TreeNode(25);
            root.left.left = new TreeNode(46);
            root.left.left.right = new TreeNode(17);
            root.right.left = new TreeNode(27);
            root.right.left.left = new TreeNode(9);
            int ans = solveAns(root,11,27,0);
            System.out.println(ans);
        }
    }
    public static int solveAns(TreeNode A, int B, int C,int count) {
        if(A==null)
            return count;
        if(A.val>B && A.val<C)
            count++;
        solveAns(A.left,B,C,count);
        solveAns(A.right,B,C,count);
        return solveAns(A.left,B,C,count)+solveAns(A.right,B,C,count);
    }
}
