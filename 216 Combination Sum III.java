class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        findSum(k, n, 1, new ArrayList<>());
        return ans;
    }
    void findSum(int k, int n, int start, List<Integer> list) {
        if(n < 0) return;
        if(list.size() == k && n == 0) {
		    ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int  i = start; i <= 9; i++) {
            list.add(i);
            findSum(k, n-i, i+1, list);
            list.remove(list.size()-1);
        }
    }
}