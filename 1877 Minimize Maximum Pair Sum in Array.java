class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int ans[] = new int[nums.length/2];
        while(i < j)
        {
            ans[i] = nums[i] + nums[j];
            i++;
            j--;
        }
        Arrays.sort(ans);
        return ans[ans.length-1];
    }
}