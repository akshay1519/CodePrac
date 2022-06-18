package practice.tree;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        ArrayList<Integer> ans = topView(root);
        System.out.println(ans);
    }

    private static ArrayList<Integer> topView(TreeNode A) {
        Queue<NodeEntry> queue = new LinkedList<>();
        HashMap<Integer,ArrayList<TreeNode>> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        NodeEntry nodeEntry = new NodeEntry(A,0);
        queue.add(nodeEntry);
        queue.add(null);
        while (queue.size()>0){

        }
        return ans;
    }
    static class NodeEntry
    {
        TreeNode node;
        int level;
        NodeEntry(TreeNode node, int level)
        {
            this.node = node;
            this.level = level;
        }
    }
}
