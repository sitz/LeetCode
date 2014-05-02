package MaximumDepthofBinaryTree;

/**
 * Created by sitesh on 3/5/14.
 */

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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lMax = maxDepth(root.left);
        int rMax = maxDepth(root.right);

        return Math.max(lMax, rMax) + 1;
    }
}