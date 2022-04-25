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
    public boolean checkTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftVal = 0;
        int rightVal = 0;
        if(root.left != null) {
            leftVal = root.left.val;
        }
        if(root.right != null) {
            rightVal = root.right.val;
        }
        if(root.val == (leftVal + rightVal)) {
            return true;
        }
        return false;
    }
}