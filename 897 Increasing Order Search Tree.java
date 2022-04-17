class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) {
            return root;
        }
        inorder(root, list);
        root.val = list.get(0);
        TreeNode temp = root;
        for(int i = 1; i < list.size(); i++) {
            TreeNode curr = new TreeNode(list.get(i));
            temp.right = curr;
            temp.left = null;
            temp = curr;
        }
        return root;
    }
}