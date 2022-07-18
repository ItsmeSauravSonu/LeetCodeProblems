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
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return null;
        TreeNode curr = root;
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        int sum = 0;
        while(curr!=null || !stack.isEmpty())
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr = curr.right;
            }
            curr = stack.pop();
            sum+=curr.val;
            curr.val = sum;
            curr = curr.left;
        }
        return root;
    }
}