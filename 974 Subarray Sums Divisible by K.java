class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for(int a: nums) {
            sum += a;
            int rem = sum%k;
            if(rem < 0) rem = rem + k;
            ans += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return ans;
    }
}