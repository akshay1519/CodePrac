package practice.recursion;

import java.util.ArrayList;

public class PathToGivenNode {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.left.right = new TreeNode(5);
            root.right.left = new TreeNode(6);
            root.right.left.left = new TreeNode(7);
            ArrayList<Integer> temp = new ArrayList<>();
            solve(root,4,temp);
            System.out.println(temp);
        }

        public static boolean solve(TreeNode A, int B,ArrayList<Integer> ans) {
            if (A == null)
                return false;
            ans.add(A.val);
            if (A.val == B) {
                return true;
            }
            if(solve(A.left, B,ans) || solve(A.right, B,ans)){
                return true;
            }
            ans.remove(ans.size()-1);
            return false;
        }
    }
}
