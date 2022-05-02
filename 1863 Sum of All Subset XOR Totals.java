class Solution {
    public int subSet(int[] nums, int idx, int xor) {
        if(idx == nums.length) {
            return xor;
        }
        int withEle = subSet(nums, idx+1, xor^nums[idx]);
        int withoutEle = subSet(nums, idx + 1,  xor); 
        return withEle + withoutEle;
    }
    public int subsetXORSum(int[] nums) {
        return subSet(nums, 0, 0);
    }
}