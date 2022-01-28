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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        for(int i = 0; i < left-1; i++)
        {
            pre = pre.next;
        }
        ListNode start = pre.next;
        ListNode nextNode = start.next;
        for(int i = 0; i < right-left; i++)
        {
            start.next = nextNode.next;
            nextNode.next = pre.next;
            pre.next = nextNode;
            nextNode = start.next;
        }
        return res.next;
    }
}