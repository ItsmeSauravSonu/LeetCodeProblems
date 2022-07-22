/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode node) {
      ArrayList<Integer> node_vals = new ArrayList<>();
       ListNode curr = node;
       while( curr!=null)
       {
           node_vals.add( curr.val);
           curr =  curr.next;
       }

       Stack<Integer> stack = new Stack<>();
       int [] output_arr = new int[node_vals.size()];
       for(int i=0;i<node_vals.size();i++)
       {
           while(!stack.isEmpty() && node_vals.get(stack.peek())<node_vals.get(i))
           {
               output_arr[stack.pop()]=node_vals.get(i);
           }
           stack.push(i);
       }
       return output_arr;
    }
}