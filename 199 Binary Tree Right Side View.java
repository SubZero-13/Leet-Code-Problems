class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()) {
            int n = qu.size();
            for(int i = 1; i <= n; i++) {
                TreeNode temp = qu.poll();
                if(i == n) {
                    ans.add(temp.val);
                }
                if(temp.left != null) {
                    qu.add(temp.left);
                }
                if(temp.right != null) {
                    qu.add(temp.right);
                }
            }
        }
        return ans;
    }
}