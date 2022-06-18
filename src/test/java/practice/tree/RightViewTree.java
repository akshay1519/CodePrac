package practice.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        ArrayList<Integer> ans = rightView(root);
        System.out.println(ans);

    }

    private static ArrayList<Integer> rightView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        TreeNode f = null;
        while (queue.size()>0){
            f = queue.poll();
            if (queue.size()>0 && queue.peek()==null){
                ans.add(f.val);
            }
            if (f==null){
                if (queue.size()>0){
                    queue.add(null);
                    continue;
                }
            }
            if (f != null && f.left!=null)
                queue.add(f.left);
            if (f != null && f.right!= null)
                queue.add(f.right);
        }
        return ans;
    }
}
