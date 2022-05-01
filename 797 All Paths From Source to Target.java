class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(0);
        dfsSearch(ans,0,curr, graph);
        return ans;
    }
    
    public void dfsSearch(List<List<Integer>> ans, int node, List<Integer> curr, int[][]graph) {
        if(node == graph.length-1) {
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        for(int nextNode:graph[node]) {
            curr.add(nextNode);
            dfsSearch(ans, nextNode, curr, graph);
            curr.remove(curr.size()-1);
        }
    }
}