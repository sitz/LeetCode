package BinaryTreePreorderTraversal;

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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<Integer>();

        if (root == null) return nodes;

        nodes.add(root.val);
        nodes.addAll(preorderTraversal(root.left));
        nodes.addAll(preorderTraversal(root.right));

        return nodes;
    }
}