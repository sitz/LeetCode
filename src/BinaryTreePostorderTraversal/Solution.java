package BinaryTreePostorderTraversal;

/**
 * Created by sitesh on 3/5/14.
 */

import java.util.ArrayList;

/**
 * Definition for binary tree
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<Integer>();

        if (root == null) return nodes;

        nodes.addAll(postorderTraversal(root.left));
        nodes.addAll(postorderTraversal(root.right));
        nodes.add(root.val);

        return nodes;
    }
}