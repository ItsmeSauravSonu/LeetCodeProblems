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
    public ListNode deleteDuplicates(ListNode head) {
       int pos [] = new int [101];
        int neg [] = new int [100];
        ListNode temp = head;
        while(temp!=null){
            if(temp.val>=0){
                pos[temp.val]++;
            }
            else{
                neg[Math.abs(temp.val)]++;
            }
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        dummy .next = head;
        temp = dummy;
        while(temp.next!=null){
            
            if(temp.next.val>=0){
                if(pos[temp.next.val]!=1){
                    temp.next = temp.next.next;
                }
                else temp = temp.next;
            }
            else{
               if(neg[Math.abs(temp.next.val)]!=1){
                   temp.next = temp.next.next;
               } 
                else temp = temp.next;
            }
        }
        return dummy.next;
    }
}