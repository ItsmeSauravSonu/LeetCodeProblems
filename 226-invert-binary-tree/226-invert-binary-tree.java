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
    public TreeNode invertTree(TreeNode root) {
          if(root == null) return null;
          swapLeftAndRight(root);
          invertTree(root.left);
          invertTree(root.right);
          return root;
    }
    private static void swapLeftAndRight(TreeNode root)
    {
            TreeNode left = root.left;
            root.left = root.right;
            root.right = left;
    }
}