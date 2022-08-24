class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1, n, k, new ArrayList<Integer>(), ans);
        return ans;
    }
    public void helper(int idx, int n, int k, ArrayList<Integer> list, List<List<Integer>> ans) {
        if(k == 0) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = idx; i <= n; i++) {
            list.add(i);
            helper(i+1, n, k-1, list, ans);
            list.remove(list.size()-1);
        }
    }
}