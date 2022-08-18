class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int key: map.keySet()) {
            int ele = map.get(key);
            pq.add(ele);
        }
        int min = 0;
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
            min++;
            if(sum >= (n/2)) {
                return min;
            }
        }
        return min;
    }
}