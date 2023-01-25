class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] path1 = new int[n];
        int[] path2 = new int[n];
        Arrays.fill(path1, -1);
        Arrays.fill(path2, -1);

        dfs(node1, 0, edges, path1);
        dfs(node2, 0, edges, path2);
        
        int res = -1, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(Math.min(path1[i], path2[i]) >= 0 && Math.max(path1[i], path2[i]) < min) {
                min = Math.max(path1[i], path2[i]);
                res  = i;
            }
        }
        return res;
    }
    private void dfs(int i, int dist, int e[], int[] path) {
        while(i != -1 && path[i] == -1) {
            path[i] = dist++;
            i = e[i];
        }
    }

}