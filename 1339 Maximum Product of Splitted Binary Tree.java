class Solution {
    long total = 0, ans = 0, s;
    public int maxProduct(TreeNode root) {
        total = sum(root);
        sum(root);
        return (int)(ans % (int)(1e9+7));
    }
    long sum(TreeNode root) {
        if(root == null) return 0;
        s = root.val + sum(root.left) + sum(root.right);
        ans = Math.max(ans, s*(total-s));
        return s;
    }
}