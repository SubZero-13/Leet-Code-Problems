class Solution {
    int[] arr;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) {
            return null;
        }
        int len  = 0;
        ListNode temp = head;
        while(temp!= null) {
            len++;
            temp = temp.next;
        }
        arr = new int[len];
        temp = head;
        int i = 0;
        while(temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        return BST(0, arr.length-1);
    }
    
    private TreeNode BST(int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = BST(start, mid-1);
        root.right = BST(mid+1, end);
        return root;
    }
    
    
    
}