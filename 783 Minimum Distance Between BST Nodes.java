class Solution {
    // public int minDiffInBST(TreeNode root) {
    //     List<Integer> list = new ArrayList<>();
    //     inOrder(root, list);
    //     int min = Integer.MAX_VALUE;
    //     for(int i = 1; i < list.size(); i++) {
    //         min = Math.min(min, list.get(i)-list.get(i-1));
    //     }
    //     return min;
    // }
    // private void inOrder(TreeNode root, List<Integer> list) {
    //     if(root == null) return;
    //     inOrder(root.left, list);
    //     list.add(root.val);
    //     inOrder(root.right, list);
    // }


    int min = Integer.MAX_VALUE, prev = -1;
    public int minDiffInBST(TreeNode root) {
       if(root.left != null) minDiffInBST(root.left);
       if(prev != -1) min = Math.min(min, root.val-prev);
       prev = root.val;
       if(root.right != null) minDiffInBST(root.right);
       return min;
    }
}