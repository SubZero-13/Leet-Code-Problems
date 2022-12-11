class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    int dfs(TreeNode root) {
        if(root == null) return 0;
        int ls = dfs(root.left);
        int rs = dfs(root.right);
        int temp = Math.max(Math.max(ls, rs)+root.val, root.val);
        int ans = Math.max(temp, ls+rs+root.val);
        max = Math.max(ans, max);
        return temp;
    }
}