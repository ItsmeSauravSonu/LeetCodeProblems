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
    
   int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int depth = getDepth(root);
        sumOfDeepestLeaves(root,depth,1);
        return sum;
    }
    
    private int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(getDepth(root.left),getDepth(root.right));
    }
    
    private void sumOfDeepestLeaves(TreeNode root, int depth, int currDepth){
        if(root==null){
            return;
        }
        if(root.left == null && root.right == null && depth == currDepth){
            sum+=root.val;
        }
        sumOfDeepestLeaves(root.left,depth,currDepth+1);
        sumOfDeepestLeaves(root.right,depth,currDepth+1);
    }
    
}