class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // 1st Method
        int ans[] = new int[queries.length];
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        for(int i = 0; i < queries.length; i++) {
            int j = Arrays.binarySearch(nums, queries[i]);
            ans[i] = Math.abs(j+1);
        }
        return ans;
        // 2nd Method
        // Arrays.sort(nums);
        // TreeMap<Integer, Integer> map = new TreeMap<>();
        // int sum = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        //     map.put(sum, i);
        // }
        // int ans[] = new int[queries.length];
        // for(int i = 0; i < queries.length; i++) {
        //    Map.Entry<Integer, Integer> entry = map.floorEntry(queries[i]);
        //    if(entry != null) {
        //        ans[i] = entry.getValue()+1;
        //    }
        // }
        // return ans;
    }
}