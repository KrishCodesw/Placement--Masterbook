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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy =new ListNode(-1);
        ListNode curr=dummy;

        ListNode p1=list1;
        ListNode p2=list2;

        while(p1!=null && p2!=null){
            if(p1.val>p2.val){
                curr.next=p2;
                p2=p2.next;
            }else{
                curr.next=p1;
                p1=p1.next;
            }
            curr=curr.next;
        }
        if(p1!=null) curr.next=p1; else curr.next=p2;

        return dummy.next;
    }
}