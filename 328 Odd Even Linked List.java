class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode even = ptr2;
        while(ptr2 != null && ptr2.next != null && ptr2.next.next != null) {
            ListNode temp = ptr2.next.next;
            ptr1.next = ptr2.next;
            ptr2.next = temp;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if(ptr2.next != null) {
            ptr1.next = ptr2.next;
            ptr1 = ptr1.next;
            ptr2.next = null;
            ptr1.next = even;
        }
        else {
            ptr2.next = null;
            ptr1.next = even;
        }
        return head;
    }
}