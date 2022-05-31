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
       TreeNode cur = root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        int sum = 0;
        while(cur !=null || !s.isEmpty()) {
            while(cur!=null) {
                s.push(cur);
                cur = cur.right;
            }
            cur = s.pop();
            sum = sum + cur.val;
            cur.val = sum;
            cur = cur.left;
            
        }
        return root;     
        
    }
}