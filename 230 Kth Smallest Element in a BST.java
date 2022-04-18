class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> list, int k) {
        if(list.size() > k || root == null) {
            return;
        }
        inorder(root.left, list, k);
        if(list.size() <= k) {
            list.add(root.val);
        }
        inorder(root.right, list, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        
        // Method 1-
         ArrayList<Integer> list = new ArrayList<>();
         inorder(root, list, k);
         Collections.sort(list);
         return list.get(k-1);
        
        // Method -2 
        // ArrayList<Integer> list = new ArrayList<>();
        // if(root == null) {
        //     return -1;
        // }
        // Queue<TreeNode> qu = new LinkedList<>();
        // qu.offer(root);
        // while(!qu.isEmpty()) {
        //     int n = qu.size();
        //     for(int i = 1; i <= n; i++) {
        //         TreeNode temp = qu.poll();
        //         list.add(temp.val);
        //         if(temp.left != null) {
        //             qu.offer(temp.left);
        //         }
        //         if(temp.right != null) {
        //             qu.offer(temp.right);
        //         }
        //     }
        // }
        // Collections.sort(list);
        // return list.get(k-1);
        
    }
}