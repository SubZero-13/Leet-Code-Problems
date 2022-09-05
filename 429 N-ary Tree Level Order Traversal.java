class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Node curr = q.poll();
                list.add(curr.val);
                for(Node node: curr.children) {
                    q.offer(node);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}