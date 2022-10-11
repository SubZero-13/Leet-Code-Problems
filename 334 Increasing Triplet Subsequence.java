class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <= 2) {
            return false;
        }
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n <= left) {
                left = n;
            }
            else if(n <= mid) {
                mid = n;
            }
            else {
                return true;
            }
        }
        return false;
    }
}