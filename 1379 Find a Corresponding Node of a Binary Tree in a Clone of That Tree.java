/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // Method - 1
    // public void helper(final TreeNode original, final TreeNode cloned, final TreeNode target, TreeNode ans) {
    //     if(original == null && cloned == null) {
    //         return;
    //     }
    //     helper(original.left, cloned.left, target, ans);
    //     if(original == target) ans.left = cloned;
    //     helper(original.right, cloned.right, target, ans);
    // }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // Method - 1 
        // if(original==null && cloned ==null) {
        //     return null;
        // }
        // Method - 1 
        // TreeNode ans = new TreeNode(0);
        // helper(original, cloned, target, ans);
        // return ans.left;
        
        
        // Method - 2
        if(original == null || original == target) {
            return cloned;
        }
        TreeNode res = getTargetCopy(original.left, cloned.left, target);
        if(res != null) {
            return res;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }
}