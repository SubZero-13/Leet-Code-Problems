class Solution {
    int[] res;
    int[] count;
    List<HashSet<Integer>> adjList;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        res = new int[n];
        count = new int[n];
        adjList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adjList.add(new HashSet<Integer>());
        }
        for(int[] e: edges) {
            adjList.get(e[0]).add(e[1]);
            adjList.get(e[1]).add(e[0]);
        }
        postOrder(0, -1);
        preOrder(0, -1);
        return res;
    }
    public void postOrder(int root, int pre) {
        for(int i: adjList.get(root)) {
            if(i == pre) continue;
            postOrder(i, root);
            count[root] += count[i];
            res[root] += res[i] + count[i];
        }
        count[root]++;
    }
    public void preOrder(int root, int pre) {
        for(int i: adjList.get(root)) {
            if(i == pre) continue;
            res[i] = res[root] - count[i] + count.length - count[i];
            preOrder(i, root);
        }
    }
}