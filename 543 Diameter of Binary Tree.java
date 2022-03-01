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
    int max = 0;
    /*private class TreeInfo {
        int ht;
        int diam;
        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }
    private TreeInfo diameter(TreeNode root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        int myHt = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));
        TreeInfo MyInfo = new TreeInfo(myHt, myDiam);
        return MyInfo;
    }*/
    public int diameterOfBinaryTree(TreeNode root) {
        // Sol 1
        /*if(root == null) {
            return 0;
        }
        return diameter(root).diam-1; */
        // Solution 2
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
    
}