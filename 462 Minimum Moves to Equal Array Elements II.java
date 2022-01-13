class Solution {
    public int minMoves2(int[] nums) {
          if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums); // sort the array
        int n = nums.length; // length of array
        int mid = n / 2; // middle of array
        int ans = 0; // answer
        for (int i = 0; i < nums.length; i++) {
            ans += Math.abs(nums[i] - nums[mid]); // diff between mid and curr index to make equal
        }
        return ans;
    }
}