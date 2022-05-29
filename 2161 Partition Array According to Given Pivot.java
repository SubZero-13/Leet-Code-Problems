class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int i = 0;
        int pivotFreq = 0;
        for(int num : nums) {
            if(num < pivot) {
                ans[i++] = num;
            }
            else if(num == pivot) {
                pivotFreq++;
            }
        }
        while(pivotFreq-- > 0) {
            ans[i++] = pivot;
        }
        for(int num : nums) {
            if(num > pivot) {
                ans[i++] = num;
            }
        }
        return ans;
    }
}