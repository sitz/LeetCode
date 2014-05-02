package BinaryTreeInorderTraversal;

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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<Integer>();

        if (root == null) return nodes;

        nodes.addAll(inorderTraversal(root.left));
        nodes.add(root.val);
        nodes.addAll(inorderTraversal(root.right));

        return nodes;
    }
}