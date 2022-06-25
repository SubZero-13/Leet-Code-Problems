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
    public TreeNode helper(int preStart, int inStart, int inEnd, int[]preorder, int[]inorder) {
        if(preStart > preorder.length-1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIdx = 0;
        for(int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == root.val) {
                inIdx = i;
            }
        }
        root.left = helper(preStart+1, inStart, inIdx-1, preorder, inorder);
        root.right = helper(preStart+inIdx-inStart+1, inIdx+1, inEnd, preorder, inorder);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }
}