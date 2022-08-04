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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return bt(preorder,inorder,0,preorder.length-1,new int[1],map);
    }
    private TreeNode bt(int[] pre,int[] in,int l,int r,int[] c, Map<Integer,Integer> map){
        if(l>r) {
            return null;
        }
        
        TreeNode node = new TreeNode(pre[c[0]]);
        c[0]+=1;
        int mid = map.get(node.val);
        node.left=bt(pre,in,l,mid-1,c,map);
        node.right=bt(pre,in,mid+1,r,c,map);
        return node;   
    }
}