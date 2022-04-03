class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = groupSizes.length;
         HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            int curr = groupSizes[i];
            List<Integer> temp = new ArrayList<>();
            if(map.containsKey(curr)) temp = map.get(curr);
            temp.add(i);
            map.put(curr, temp);
            if(temp.size() == curr){
                ans.add(temp);
                map.remove(curr);
            }
        }
        
        return ans;
    }
}