class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
       TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++) {
            Long el = 1L * nums[i];
            Long floor = set.floor(el);
            Long ceil = set.ceiling(el);
            if(floor != null && Math.abs(floor-el) <= t || ceil != null && Math.abs(ceil-el) <= t) {
                return true;
            } 
            set.add(el);
            if(set.size() > k) {
                set.remove(1L * nums[i-k]);
            }
        }
        return false;
    }
}