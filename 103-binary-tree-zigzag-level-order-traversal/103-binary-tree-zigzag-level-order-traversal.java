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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> ans = new ArrayList<>();
     if(root==null) return ans;
     int level = 0;
    
     Queue<TreeNode> queue = new LinkedList<>();
     queue.offer(root);
    while(!queue.isEmpty())
    {
       level = level +1;
       List<Integer> temp = new ArrayList<>();
       int size = queue.size();
       for(int i=0;i<size;i++){
           TreeNode node = queue.poll();
           temp.add(node.val);
           if(node.left!=null) queue.offer(node.left);
           if(node.right!=null) queue.offer(node.right);
       }
       if(level%2==0)
       {
           Collections.reverse(temp);
       }
        ans.add(temp);
    }
        return ans;
    }
}