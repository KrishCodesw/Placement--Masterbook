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
    public void reorderList(ListNode head) {
        // 1 base condition 
        if(head==null || head.next==null) return;

        // 2 Finding middle node 

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // 3 Saving the second part of the list using a new node 
        ListNode secondHalf=slow.next;
        // 4 Deleting the next half
        slow.next=null;

        // 5 reversing the second half 
        ListNode prev=null;
        ListNode curr=secondHalf;

        while(curr!=null){
            ListNode newNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNode;
        }
        // 6 after this loop ends prev is the first head of the reversed list 
        
        ListNode firstHalf= head;
        secondHalf=prev;

        while(secondHalf!=null){
            ListNode t1=firstHalf.next;
            ListNode t2=secondHalf.next;

            firstHalf.next=secondHalf;
            secondHalf.next=t1;
            firstHalf=t1;
            secondHalf=t2;
        }
    }
}