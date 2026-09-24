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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int count=0;

        while(curr!=null && count<k){
            curr=curr.next;
            count++;
        }

        if(count<k){
            return head;
        }

        int counter=0;
        ListNode current=head;
        ListNode prev=null;

        while(counter<k){
            ListNode nextTemp=current.next;
            current.next=prev;
            prev=current; 
            current=nextTemp;
            counter++;
        }

        head.next=reverseKGroup(current,k);
        return prev;
    }
}