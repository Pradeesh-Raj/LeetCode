/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public void helper(TreeNode root, int l, int h) {
        if(root == null) return;
        if(l >= root.val) {
            if(l == root.val) sum += root.val;
            helper(root.right, l, h);
        }
        else if(h <= root.val) {
            if(h == root.val) sum += root.val;
            helper(root.left, l, h);
        }
        else {
            sum += root.val;
            helper(root.left, l, h);
            helper(root.right, l, h);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root, low, high);
        return sum;
    }
}