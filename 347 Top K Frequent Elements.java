class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) {
            return new int[k];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a)- map.get(b));
        for(int key: map.keySet()) {
            pq.add(key);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int ans[] = new int[k];
        int i = 0;
        while(!pq.isEmpty()) {
            ans[i++] = pq.poll();
        }
        return ans;
    }
}