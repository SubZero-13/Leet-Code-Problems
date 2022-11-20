class Solution {
    public int countNodes(TreeNode root) {
        int left = leftHt(root);
        int right = rightHt(root);
        if(left == right) return ((1 << left)-1);
        return (1 + countNodes(root.left) + countNodes(root.right)); 
    }
    public int leftHt(TreeNode root) {
        int count = 0;
        while(root != null) {
            count += 1;
            root = root.left;
        }
        return count;
    }
    public int rightHt(TreeNode root) {
        int count = 0;
        while(root != null) {
            count += 1;
            root = root.right;
        }
        return count;
    }
}