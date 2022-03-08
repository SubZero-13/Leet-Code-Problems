class Solution {
    public void helper(int[] candidates, int remain, int idx, List<List<Integer>> ans,  List<Integer> temp) {
        if(remain < 0) {
            return;
        }
        if(remain == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        else {
            for(int i = idx; i < candidates.length; i++) {
                temp.add(candidates[i]);
                helper(candidates, remain-candidates[i], i, ans, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        helper(candidates, target, 0, ans, temp);
        return ans;
    }
}