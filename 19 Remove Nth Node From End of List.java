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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
        {
            return null;
        }
        // Calculating Size of Linked List
        int sz = 0;
        ListNode size = head;
        while(size != null)
        {
            sz++;
            size = size.next;
        }
        // If Size is equal to n
        if(n == sz)
        {
            head = head.next;
            return head;
        }
        // if size is greater than n
        ListNode ans = head;
        ListNode refPtr = head;
        ListNode mainPtr = head;
        int count = 0;
        while(count < n)
        {
            refPtr = refPtr.next;
            count++;
        }
        ListNode prev = ans;
        while(refPtr != null)
        {
            prev = mainPtr;
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        prev.next = mainPtr.next;
        mainPtr.next = null;
        return head;
    }
}