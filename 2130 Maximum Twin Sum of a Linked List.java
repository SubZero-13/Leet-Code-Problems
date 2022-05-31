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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int arr[] = new int[size];
        temp = head;
        int i = 0;
        while(temp != null) {
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }
        i = 0;
        int j = arr.length-1;
        int sum = 0;
        while(i < j) {
            sum = Math.max(sum, arr[i] + arr[j]);
            i++;
            j--;
        }
        return sum;
    }
}