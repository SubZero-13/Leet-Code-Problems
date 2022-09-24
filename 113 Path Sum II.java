class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<Integer>());
        return ans;
    }
    private void dfs(TreeNode root, int target, List<Integer>  list) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        if(root.left == null && root.right == null && target == root.val) {
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        else {
            dfs(root.left, target-root.val, list);
            dfs(root.right, target-root.val, list);
        }
        list.remove(list.size()-1);
    }
}