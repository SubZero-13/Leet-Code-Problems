class Solution {
    public int thirdMax(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int n = set.size();
        Integer arr[] = new Integer[n];
        arr = set.toArray(arr);
        if(arr.length == 1) {
            return arr[0];
        }
        else if(arr.length == 2) {
            return arr[1];
        }
        else if(arr.length >= 3) {
            return arr[n-3];
        }
        return -1;
        
    }
}