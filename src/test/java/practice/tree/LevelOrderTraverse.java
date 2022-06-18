package practice.tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) {
      val = x;
      left=null;
      right=null;
     }
 }
public class LevelOrderTraverse {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(346);
        root.left = new TreeNode(162);
        root.right = new TreeNode(59);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(-7);
        root.right.left.left = new TreeNode(-4);
        root.right.left.right = new TreeNode(8);
        root.right.left.right.left = new TreeNode(10);
        ArrayList<ArrayList<Integer>> ans = levelOrder(root);
        System.out.println(ans);

    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(A);
        if (A!=null){
            que.add(null);
        }
        ArrayList<Integer> levelVal = new ArrayList<>();
        while (!que.isEmpty()){
            TreeNode t = que.peek();
            que.poll();
            if(t!=null)
                levelVal.add(t.val);
            if (t==null){
                ans.add(levelVal);
                levelVal = new ArrayList<>();
                if (!que.isEmpty()){
                    que.add(null);
                }
                continue;
            }
            if (t.left!=null){
                que.add(t.left);
            }if (t.right!=null){
                que.add(t.right);
            }
        }
        return ans;
    }
}
