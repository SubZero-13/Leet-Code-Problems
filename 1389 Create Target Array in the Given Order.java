class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] arr = new int[nums.length];
        Arrays.fill(arr, -1);
        for(int i=0;i<nums.length;i++) {
            if(arr[index[i]] == -1) {
                arr[index[i]] = nums[i];
            }else {
                System.arraycopy(arr, index[i], arr, index[i]+1, nums.length-index[i]-1);
                arr[index[i]] = nums[i];
            }
        }
        return arr;
    }
}