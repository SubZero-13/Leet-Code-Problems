class Solution {
    public void backTrack(List<List<Integer>> ans, int[] nums, List<Integer> list, boolean[] visited) {
        if(list.size() == nums.length) {
            ans.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            list.add(nums[i]);
            backTrack(ans, nums, list, visited);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(ans, nums, new ArrayList(), visited);
        return ans;
    }
}