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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        TreeNode curr = root;
       Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(curr);
    while(!st1.isEmpty())
    {
        curr = st1.peek();
        st1.pop();
        st2.push(curr);
        if(curr.left!=null)
        {
            st1.push(curr.left);
        }
        if(curr.right!=null)
        {
            st1.push(curr.right);
        }
            
    }
        while(!st2.isEmpty())
        {
            list.add(st2.peek().val);
            st2.pop();
        }
        return list;
    }
}