class Solution {
    public String tree2str(TreeNode root) {
        return preOrder(root);
    }
    private String preOrder(TreeNode root) {
        if(root == null) {
           return "";
        }
        String res = root.val + "";
        String left = preOrder(root.left);
        String right = preOrder(root.right);
        if(left == "" && right == "") {
            return res;
        }
        if(left == "") {
            return res + "()" + "(" + right + ")"; 
        }
        if(right == "") {
            return res + "(" + left + ")";
        }
        return res + "(" + left + ")" + "(" + right + ")";
    }
}