class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List <Integer> res = new ArrayList<Integer>();
        int i = 0;
        int j = nums.length-1;
        while(i < nums.length)
        {
            if(nums[i] == target)
            {
                res.add(0, i);
                break;
            }
            i++;
        }
         while(j > i)
        {
            if(nums[j] == target)
            {
                res.add(1, j);
            }
            j--;
        }
        return res;
    }
}