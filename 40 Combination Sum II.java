class Solution {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(0, candidates, target, new ArrayList<Integer>(), ans);
        return ans;
    }
    private void backTrack(int idx, int[] nums, int target, List<Integer> list, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList(list));
            return;
        }
        if(target < 0) {
            return;
        }
        for(int i = idx; i < nums.length; i++) {
            if(i > idx && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
            list.add(nums[i]);
            backTrack(i+1, nums, target-nums[i], list, ans);
            list.remove(list.size()-1);
        }
            
    }
}