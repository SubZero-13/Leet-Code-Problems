class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int task: tasks) {
            map.put(task, map.getOrDefault(task, 0)+1);
        }
        int ans = 0;
        for(int key: map.keySet()) {
            int val = map.get(key);
            if(val == 1) return -1;
            ans += ((val+2)/3);
        }
        return ans;
    }
}