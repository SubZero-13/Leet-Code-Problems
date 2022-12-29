class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] ans= new int[n];
        int allTasks[][] = new int[n][3];
        for(int i = 0; i < n; i++) {
            allTasks[i][0] = i;
            allTasks[i][1] = tasks[i][0];
            allTasks[i][2] = tasks[i][1];
        }

        Arrays.sort(allTasks, (a,b)->a[1] - b[1]);
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[2] == b[2] ? a[0] - b[0] : a[2] - b[2]);
        int t = 0;
        int a = 0;
        int time = 0;
        while(a < n) {
            while(t < n && allTasks[t][1] <= time) {
                pq.offer(allTasks[t++]);
            }
            if(pq.isEmpty()) {
                time = allTasks[t][1];
                continue;
            }
            int[] temp = pq.poll();
            ans[a++] = temp[0];
            time += temp[2];
        }
        return ans;
    }
}