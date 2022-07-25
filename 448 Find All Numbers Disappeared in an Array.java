class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            nums[num-1] = -Math.abs(nums[num-1]);
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0)
                ans.add(i+1);
        }
        return ans;
    }
}
