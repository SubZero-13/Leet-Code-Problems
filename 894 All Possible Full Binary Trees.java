class Solution {
    
//  Using DP - Memoization
    
    Map<Integer, List<TreeNode>> dp = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(n == 1) {
            List<TreeNode> treeNodes = new ArrayList<>();
            treeNodes.add(new TreeNode(0));
            return treeNodes;
        }
        if(dp.containsKey(n)) {
            return dp.get(n);
        }
        List<TreeNode> ans = new ArrayList<>();
        for(int i = 1; i < n; i+= 2) {
            List<TreeNode> leftTree = allPossibleFBT(i);
            List<TreeNode> rightTree = allPossibleFBT(n-i-1);
            for(TreeNode l: leftTree) {
                for(TreeNode r: rightTree) {
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    ans.add(root);
                }
            }
        }
        dp.put(n, ans);
        return ans;
    }
    
    
//      *Using Recurssion*
//     public List<TreeNode> allPossibleFBT(int n) {
//         if(n == 1) {
//             List<TreeNode> treeNodes = new ArrayList<>();
//             treeNodes.add(new TreeNode(0));
//             return treeNodes;
//         }
        
//         List<TreeNode> ans = new ArrayList<>();
//         for(int i = 1; i < n; i+= 2) {
//             List<TreeNode> leftTree = allPossibleFBT(i);
//             List<TreeNode> rightTree = allPossibleFBT(n-i-1);
//             for(TreeNode l: leftTree) {
//                 for(TreeNode r: rightTree) {
//                     TreeNode root = new TreeNode(0);
//                     root.left = l;
//                     root.right = r;
//                     ans.add(root);
//                 }
//             }
//         }
//         return ans;
//     }
    
}