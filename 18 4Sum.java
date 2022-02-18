class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int t3 = target - nums[i];
            for(int j = i+1; j < nums.length; j++) {
                int t2 = t3 - nums[j];
                int front = j+1;
                int back = nums.length-1;
                while(front < back) {
                    int twoSum = nums[front] + nums[back];
                    if(twoSum < t2) ++front;
                    else if(twoSum > t2) --back;
                    else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[front]);
                        temp.add(nums[back]);
                        ans.add(temp);
                        while(front < back && nums[front] == temp.get(2)) ++front;
                        while(front < back && nums[back] == temp.get(3)) --back;
                    }
                }
                while(j+1 < nums.length && nums[j+1] == nums[j]) ++j;
            }
            while(i+1 < nums.length && nums[i+1] == nums[i]) ++i;
        }
        return ans;
    }
}