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
    static int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        maxsum(root);
        return max;
    }
    private int maxsum(TreeNode node) {
        if(node == null) return 0;
        int l = Math.max(0, maxsum(node.left));
        int r = Math.max(0, maxsum(node.right));
        max = Math.max(max, l + r + node.val);
        return node.val +Math.max(l,r);
    }
}