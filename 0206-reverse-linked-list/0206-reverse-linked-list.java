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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        // prev , curr, fast and slow  (pointers)
        // save your next rule 
        // first save your next in nextTemp
        // change your current node's pointer 
        // move prev and current one step ahead 

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode nodeTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nodeTemp;
        }
        return prev;
    }
}