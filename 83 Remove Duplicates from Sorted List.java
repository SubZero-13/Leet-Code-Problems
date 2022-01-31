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
    public ListNode deleteDuplicates(ListNode head) {
        /* Method 1 Not a Very Optimal Solution
        if(head == null)
        {
            return null;
        }
        ListNode current = head;
        ListNode prev = head;
        int n = prev.val;
        while(current != null)
        {
            n = prev.val;
            current = current.next;
            while(current != null && current.val == n)
            {
                ListNode node = current;
                current = node.next;
                prev.next = current;
            }
            prev = prev.next;
        }
        */
        
        // Method 2 Optimal Solution
        
        ListNode current = head;
        while(current != null && current.next != null)
        {
            if(current.val == current.next.val)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
        
        return head;
    }
}