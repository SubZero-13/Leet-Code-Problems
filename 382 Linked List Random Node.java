class Solution {
    int N = 0;
    ListNode head = null;
    public Solution(ListNode head) {
        this.head = head;
        while (head != null) {
            this.N ++;
            head = head.next;
        }
    }
    
    public int getRandom() {
        int i = (int)(Math.random() * this.N);
        ListNode p = this.head;
        while (i > 0) { 
            p = p.next;
            i -= 1;
        }
        return p.val;
    }
}