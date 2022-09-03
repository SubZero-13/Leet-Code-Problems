class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length-1; i++) {
            if(set.contains(nums[i] + nums[i+1])) {
                return true;
            }
            set.add(nums[i] + nums[i+1]);
        }
        return false;
    }
}