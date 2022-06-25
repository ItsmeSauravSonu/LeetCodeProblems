/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        Set<ListNode> set = new HashSet<>();
        while(curr != null)
        {
            if(set.contains(curr))
            {
                return prev.next;
            }
            set.add(curr);
            prev = curr;
            curr = curr.next;
        }
        return null;
    }
}