class MyHashSet {
    Node[] buckets;
    public MyHashSet() {
        buckets = new Node[10];
    }
    
    public void add(int key) {
        Node head = buckets[key%buckets.length];
        while(head != null) {
            if(head.key == key) {
                return;
            }
            head = head.next;
        }
        head = buckets[key%buckets.length];
        Node node = new Node(key);
        node.next = head;
        buckets[key%buckets.length] = node;
    }
    
    public void remove(int key) {
        Node head = buckets[key%buckets.length];
        Node temp = null;
        while(head != null) {
            if(head.key == key) {
                break;
            }
            temp = head;
            head = head.next;
        }
        if(head == null) {
            return;
        }
        if(temp != null) {
            temp.next = head.next;
        }
        else {
            buckets[key%buckets.length] = head.next;
        }
    }
    
    public boolean contains(int key) {
        Node head = buckets[key%buckets.length];
        while(head != null) {
            if(head.key == key) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    private class Node {
        int key;
        Node next;
        Node(int key) {
            this.key = key;
        }
    }
}