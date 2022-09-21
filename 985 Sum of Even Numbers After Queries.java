class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int i = 0;
        int sum = 0;
        for(int ele: nums) {
            if(ele % 2 == 0) {
                sum += ele;
            }
        }
        for(int[] a: queries) {
            int ele = nums[a[1]];
            nums[a[1]] += a[0];
            if(ele % 2 == 0) {
                sum -= ele;
            }
            if(nums[a[1]] % 2 == 0) {
                sum += nums[a[1]];
            }
            ans[i++] = sum;
        }
        return ans;
    }
}