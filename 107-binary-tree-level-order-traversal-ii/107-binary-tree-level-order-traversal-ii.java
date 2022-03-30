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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        Stack<List<Integer>> stack = new Stack<>();
        Queue<TreeNode>  queue = new LinkedList<>();
        if(root==null) return list;
        queue.offer(root);
        while(!queue.isEmpty())
        {
                int levelNum = queue.size();
                List<Integer> sublist = new ArrayList<>();
                for(int i=0;i<levelNum;i++)
                {
                   TreeNode curr = queue.poll();
                   sublist.add(curr.val);
                   if(curr.left!=null) queue.offer(curr.left);
                   if(curr.right!=null) queue.offer(curr.right);
                }
                stack.push(sublist);
        }
        
        while(!stack.isEmpty())
        {
                list.add(stack.pop());
        }
        return list;
    }
}