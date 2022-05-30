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
    int res = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return res;
    }
    
    public int[] dfs(TreeNode node) {
        int sum = node.val;
        int count = 1;
        if (node.left != null) {
            int[] left = dfs(node.left);
            sum += left[0];
            count += left[1];
        }
        if (node.right != null) {
            int[] right = dfs(node.right);
            sum += right[0];
            count += right[1];
        }
        if (sum / count == node.val) res++;
        return new int[]{sum, count};
    }

}