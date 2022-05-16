/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int[] helper(TreeNode root) {
        if(root == null) {
            return new int[] {0, 0};
        }
        int left[] = helper(root.left);
        int right[] = helper(root.right);
        int currSum = left[0] + right[0] + root.val;
        int currCount = left[1] + right[1] + 1;
        if(currSum / currCount == root.val) {
            ans++;
        }
        return new int[] {currSum, currCount};
    }
    public int averageOfSubtree(TreeNode root) {
        int [] dfs = helper(root);
        return ans;
    }
}