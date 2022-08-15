class Solution {
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    private static List<TreeNode> helper(int st, int end) {
        List<TreeNode> ans = new ArrayList<>();
        if(st > end) {
            ans.add(null);
            return ans;
        }
        for(int i = st; i <= end; i++) {
            List<TreeNode> left = helper(st, i-1);
            List<TreeNode> right = helper(i+1, end);
            for(TreeNode l: left) {
                for(TreeNode r: right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}