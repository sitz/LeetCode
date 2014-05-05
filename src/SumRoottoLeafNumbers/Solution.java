package SumRoottoLeafNumbers;

/**
 * Created by sitesh on 5/5/14.
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
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;

        int leftSum = 0;
        if (root.left != null) {
            root.left.val = 10 * root.val + root.left.val;
            leftSum = sumNumbers(root.left);
        }

        int rightSum = 0;
        if (root.right != null) {
            root.right.val = 10 * root.val + root.right.val;
            rightSum = sumNumbers(root.right);
        }

        return leftSum + rightSum;
    }
}
