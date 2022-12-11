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
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }
    private int helper(TreeNode root){
        if(root == null ) return 0;
        int left = Math.max(helper(root.left),0);
        int right = Math.max(helper(root.right),0);
        
        maxSum = Math.max(maxSum, left+right+root.val);
        return Math.max(left+root.val, right+root.val);
    }
}