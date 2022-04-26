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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode d = dummy;
        ListNode temp = head.next;
        int sum = 0;
        while(temp != null) {
            if(temp.val == 0) {
                ListNode helper = new ListNode(sum);
                d.next = helper;
                d = d.next;
                sum = 0;
            }
            sum += temp.val;
            temp = temp.next;
        }
        return dummy.next;
    }
}