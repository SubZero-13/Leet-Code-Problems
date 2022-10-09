class Solution {
    
    Set<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if(set.contains(temp.val)) {
                    return true;
                }
                else {
                    set.add(k-temp.val);
                }
                if(temp.left != null) {
                    q.offer(temp.left);
                }
                if(temp.right != null) {
                    q.offer(temp.right);
                }
            }
        }
        return false;
    }
    
    
    // Set<Integer> set;
    // public boolean findTarget(TreeNode root, int k) {
    //     set = new HashSet<>();
    //     return dfs(root, k);
    // }
    // private boolean dfs(TreeNode root, int target) {
    //     if(root == null) {
    //         return false;
    //     }
    //     if(set.contains(root.val)) {
    //         return true;
    //     }
    //     else {
    //         set.add(target-root.val);
    //     }
    //     return dfs(root.left, target) || dfs(root.right, target);
    // }
}