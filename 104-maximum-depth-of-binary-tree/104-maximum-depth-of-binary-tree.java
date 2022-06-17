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
    public int maxDepth(TreeNode root) {
int height = 0;
        if ( root == null) return 0;
        Queue <TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()) {
            height += 1;
            int queueLength = queue.size();
            for( int i=0; i< queueLength; i++ ) {
                TreeNode currentNode = queue.remove();
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
        }
        return height;

    }
}