/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr=head;
        HashMap<Node,Node> map=new HashMap<>();
        if(curr==null) return null;
        while(curr!=null){
            Node newClone=new Node(curr.val);
            map.put(curr,newClone);
            curr=curr.next;
        }
        curr = head;
        while(curr!=null){
            Node clonedNode=map.get(curr);
            clonedNode.next=map.get(curr.next);
            clonedNode.random=map.get(curr.random);
            curr=curr.next;
        }
    return map.get(head);
    }
}