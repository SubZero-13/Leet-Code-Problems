/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getStartingNodeFromLoop(ListNode slowPtr, ListNode head)
    {
        ListNode temp = head;
        while(slowPtr != temp)
        {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr)
            {
                return getStartingNodeFromLoop(slowPtr, head);
            }
        }
        return null;
    }
}