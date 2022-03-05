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
       Node itr = head, next;
        while(itr != null) {
            next = itr.next;
            Node copy = new Node(itr.val);
            itr.next = copy;
            copy.next = next;
            itr = next;
        }
        itr = head;
        while(itr != null) {
            if(itr.random != null) {
                itr.next.random = itr.random.next;
            }
            itr = itr.next.next;
        }
        itr = head;
        Node head2 = new Node(0);
        Node copy, copyItr = head2;
        while(itr != null) {
            next = itr.next.next;
            copy = itr.next;
            copyItr.next = copy;
            copyItr = copy;
            itr.next = next;
            itr = next;
        }
        return head2.next;
        
        
    }
}