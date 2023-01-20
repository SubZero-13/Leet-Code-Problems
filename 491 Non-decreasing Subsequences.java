class Solution {
    Set<List<Integer>> set;
    public List<List<Integer>> findSubsequences(int[] nums) {
        set = new HashSet<List<Integer>>();
        dfs(nums, new ArrayList<Integer>(), 0);
        List ans = new ArrayList(set);
        return ans;

    }
    private void dfs(int[] nums, List<Integer> list, int idx) {
        if(list.size() >= 2) {
            set.add(new ArrayList(list));
        }
        for(int i = idx; i < nums.length; i++) {
            if(list.size() == 0 || list.get(list.size()-1) <= nums[i]) {
                list.add(nums[i]);
                dfs(nums, list, i+1);
                list.remove(list.size()-1);
            } 
        }
    }
}