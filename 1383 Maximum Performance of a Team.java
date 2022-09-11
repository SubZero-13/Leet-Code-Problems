class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] temp = new int[n][2];
        for (int i = 0; i < n; ++i)
            temp[i] = new int[] {efficiency[i], speed[i]};
        
        Arrays.sort(temp, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long sum = 0;
        long ans = 0;
        
        for(int a[]: temp) {
            pq.add(a[1]);
            sum = sum + a[1];
            if(pq.size() > k) {
                sum -= pq.poll();
            }
            ans = Math.max(ans, (sum*a[0]));
        }
        return (int)(ans % (long)(1e9 + 7));
    }
}