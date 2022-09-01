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
    public ListNode mergeNodes(ListNode head) {
       ListNode res = new ListNode(0);
        ListNode headRes = res;
        int currentSum = 0;
        while(head!=null){
            if(head.val==0 && currentSum!=0){
                res.next= new ListNode(currentSum);
                res = res.next;;
                currentSum=0;
            }else{
                currentSum += head.val;
            }
            head=head.next;
        }
        return headRes.next;
    }
}