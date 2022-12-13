class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> ans  = new ArrayList<>();
        ans.add(1);
        while(ans.size() < n) {
            List<Integer> temp = new ArrayList<>();
            for(int el: ans) {
                if(2*el-1 <= n) temp.add(2*el-1);
            }
            for(int el: ans) {
                if(2*el <= n) temp.add(2*el);
            }
            ans = temp;
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}