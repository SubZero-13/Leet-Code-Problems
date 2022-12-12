class Solution {
    public long minimalKSum(int[] nums, int k) {
        long ans = (long)k*(k+1)/2;
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num: nums) {
            if(!set.contains(num) && num <= k && num >= 1) {
                ans -= (long)num;
                count += 1;
            }
            set.add(num);
        }
        int i = k+1;
        while(count > 0) {
            if(!set.contains(i)) {
                ans += (long)i;
                count--;
            }
            i++;
        }
        return ans;
    }
}