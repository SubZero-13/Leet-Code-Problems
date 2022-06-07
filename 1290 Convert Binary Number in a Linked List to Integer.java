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
    public int getDecimalValue(ListNode head) {
        // Approach -1 
        // ListNode temp = head;
        // String binary = "";
        // while(temp != null) {
        //     binary += temp.val;
        //     temp = temp.next;
        // }
        // return Integer.parseInt(binary, 2);
        
        // Approach - 2
        int sum = 0;
        while(head != null) {
            sum *= 2;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }
}