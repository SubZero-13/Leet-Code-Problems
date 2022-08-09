class Solution {
    List<TreeNode> sortedTree = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return balanced(0, sortedTree.size()-1);
    }
    
    private void inorder(TreeNode root) {
        if(root == null) return;
        
        inorder(root.left);
        sortedTree.add(root);
        inorder(root.right);
    }
    
    private TreeNode balanced(int start, int end) {
        if(start > end) return null;
        
        int mid = (start + end)/2;
        TreeNode root = sortedTree.get(mid);
        root.left = balanced(start, mid-1);
        root.right = balanced(mid+1, end);
        return root;
    }
}