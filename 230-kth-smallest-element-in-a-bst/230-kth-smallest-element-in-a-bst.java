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
    public int kthSmallest(TreeNode root, int k) {
        
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty())
        {
            while(root!=null){
                stack.push(root); 
                root = root.left;
            }
            root = stack.pop();
             k=k-1;
             if(k==0) break;
            root = root.right;
        }
        return root.val;
    }
}