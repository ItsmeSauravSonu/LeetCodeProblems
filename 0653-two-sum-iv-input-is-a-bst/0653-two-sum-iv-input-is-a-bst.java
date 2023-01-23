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
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        
        List<Integer> li = printInorder(root);
        System.out.println(li);
        int n = li.size();
        if(n==1 && n!=k) return false;
        int left = 0;
        int right = n-1;
        boolean ans = false;
        while(left<right){
            if(li.get(left)+li.get(right)==k){
                ans = true;
                left++;
                right--;
            }
             else if(li.get(left)+li.get(right)<k){
                left++;
            }else{
                 right--;
             }
        }
        return ans;
    }
  public List<Integer> printInorder(TreeNode node)
    {
      
        if (node == null)  return list;   
        printInorder(node.left);
        list.add(node.val);
        printInorder(node.right);
       return list;
    }
}