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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            while(!s1.isEmpty()) {
                TreeNode curr = s1.pop();
                tmp.add(curr.val);
                if(curr.left != null) {
                    s2.push(curr.left);
                }
                if(curr.right != null) {
                    s2.push(curr.right);
                }
            }
            if(!tmp.isEmpty())
                 ans.add(tmp);
            tmp = new ArrayList<Integer>();
            while(!s2.isEmpty()) {
                TreeNode curr = s2.pop();
                tmp.add(curr.val);
                if(curr.right != null) {
                    s1.push(curr.right);
                }
                if(curr.left != null) {
                    s1.push(curr.left);
                }
            }
            if(!tmp.isEmpty())
                ans.add(tmp);
        }
        return ans;
    }
}