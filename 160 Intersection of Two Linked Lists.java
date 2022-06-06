/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Approach - 1
        // Set<ListNode> set = new HashSet<>();
        // ListNode temp = headA;
        // while(temp != null) {
        //     set.add(temp);
        //     temp = temp.next;
        // }
        // temp = headB;
        // while(temp != null) {
        //     if(set.contains(temp)) {
        //         return temp;
        //     }
        //     temp = temp.next;
        // }
        // return null;
        
        // Approach - 2
        
        ListNode head1 = headA;
        ListNode head2 = headB;
        while(head1 != head2) {
            head1 = head1 == null?headB:head1.next;
            head2 = head2 == null?headA:head2.next;
        }
        return head2;
    }
}