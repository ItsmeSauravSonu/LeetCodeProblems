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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode curr =  head;
        
        
        ListNode kthNode = null;
        int i = 1;
        while(curr != null){
            if(i == k){
                kthNode = curr;
                break;
            }
            i++;
            curr = curr.next;
        }
        
        
        ListNode slow = head;
        ListNode fast = kthNode;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode kthNodeFromLast = slow;
        
        
        int temp = kthNode.val;
        kthNode.val = kthNodeFromLast.val;
        kthNodeFromLast.val = temp;

        
        return head;
    }
}