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
    int count = 0;
    public int postorder(TreeNode root) {
        if(root == null) return 0;
        int left = postorder(root.left);
        int right = postorder(root.right);
        int max = Math.max(root.val, Math.max(left, right));
        if(max == root.val) {
            count++;
        }
        return max;
    }
    public int countDominantNodes(TreeNode root) {
        postorder(root);
        return count;
    }
}