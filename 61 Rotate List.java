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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int rotationNumber = k%size;
        while(rotationNumber != 0) {
            temp = head;
            ListNode prev = head;
            while(temp != null && temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            temp.next = head;
            head = temp;
            prev.next = null;
            rotationNumber--;
        }
        return head;
    }
}