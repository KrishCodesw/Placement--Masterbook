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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>heap=new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                heap.offer(lists[i]);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode currentNode=dummy;
        while(!heap.isEmpty()){

        ListNode smallest = heap.poll();
        currentNode.next=smallest;
        currentNode=currentNode.next;
        if(smallest.next!=null){
            heap.offer(smallest.next);
        }
        
        }
    return dummy.next;
        
    }
}