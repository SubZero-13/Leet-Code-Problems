class Solution {
    public int rob(int[] nums) {
      int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
      int arr1[] = new int[n-1];
      int arr2[] = new int[n-1];
      int j = 0, k = 0;
      for(int i = 0; i < n; i++) {
        if(i != 0) arr1[j++] = nums[i];
        if(i != (n-1)) arr2[k++] = nums[i];
      }
      return Math.max(solve(arr1), solve(arr2));
    }
  
    private int solve(int arr[]) {
      int n = arr.length;
      int prev = arr[0];
      int prev2 = 0;
      for(int i = 1; i < n; i++) {
          int pick = prev2 + arr[i];
          int notPick = 0 + prev;
          int curr = Math.max(pick, notPick);
          prev2 = prev;
          prev = curr;
      }
        return prev;
    }
}