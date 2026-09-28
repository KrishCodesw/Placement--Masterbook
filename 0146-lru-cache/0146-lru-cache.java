class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
    }

    int capacity;
    HashMap<Integer,Node> map;
    Node head;
    Node tail; 

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
    }

    // Making helper functions 
    // removing a node from the list
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    // adding the node to the next of head (most recently used) 

    private void addToFront(Node node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }

    
    public int get(int key) {
      if(!map.containsKey(key)){
        return -1;
      }
      Node node=map.get(key);
      remove(node);
      addToFront(node);
      return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            remove(node);
            addToFront(node);
        }else{
            if(map.size()>=capacity){
                Node lru=tail.prev;
                map.remove(lru.key);
                remove(lru);
            }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            addToFront(newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */