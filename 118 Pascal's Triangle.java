class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0) {
            return ans;
        }
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for(int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++) {
                temp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}
    