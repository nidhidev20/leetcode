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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }

    void helper(TreeNode root, int lvl, List<List<Integer>> ans) {
        if(root == null) return;
        if(lvl == ans.size()) ans.add(new ArrayList<>());
        ans.get(lvl).add(root.val);
        helper(root.left, lvl +1,ans);
        helper(root.right, lvl +1, ans);
    }
}