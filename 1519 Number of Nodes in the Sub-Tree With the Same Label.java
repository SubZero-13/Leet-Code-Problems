class Solution {
    int[] ans;
    List<List<Integer>> adjList;
    Set<Integer> visited;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        ans = new int[n];
        adjList = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for(int[] e: edges) {
            adjList.get(e[0]).add(e[1]);
            adjList.get(e[1]).add(e[0]);
        }
        visited = new HashSet<>();
        dfs(0, labels);
        return ans;
    }
    public int[] dfs(int node, String labels) {
        visited.add(node);
        int[] count = new int[26];
        for(int adj: adjList.get(node)) {
            if(!visited.contains(adj)) {
                int[] temp = dfs(adj, labels);
                for(int i = 0; i < 26; i++) {
                    count[i] += temp[i];
                }
            }
        }
        char ch = labels.charAt(node);
        count[ch-'a']++;
        ans[node] = count[ch-'a'];
        return count;
    }
}