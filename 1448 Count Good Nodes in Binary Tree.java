class Solution {
    public int goodNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return good(root, root.val);
    }
    private int good(TreeNode root, int v) {
        if(root == null) {
            return 0;
        }
        int max = Math.max(root.val, v);
        return (root.val >= max ? 1 : 0) + good(root.left, max) + good(root.right, max);
    }
}