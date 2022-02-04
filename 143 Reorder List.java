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
    public void sol(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode temp = head;
        ListNode pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
        temp.next = head.next;
        head.next = temp;
        sol(head.next.next);
    }
    public void reorderList(ListNode head) {
        sol(head);
    }
}