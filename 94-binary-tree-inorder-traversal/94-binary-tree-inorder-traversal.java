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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        pushAllLeft(root, stack);
        while(!stack.isEmpty())
        {
            TreeNode curr = stack.pop();
            list.add(curr.val);
            pushAllLeft(curr.right, stack);
        }
        return list;
    }
    public void pushAllLeft(TreeNode node, Stack stack)
    {
        while (node != null) {
        stack.add(node);
        node = node.left;
    }
    }
}