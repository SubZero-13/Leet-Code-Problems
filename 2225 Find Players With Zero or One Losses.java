class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < matches.length; i++) {
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);
        }
        TreeSet<Integer> ans0 = new TreeSet<>();
        TreeSet<Integer> ans1 = new TreeSet<>();
        for(int i = 0; i < matches.length; i++) {
            if(!map.containsKey(matches[i][0])) {
                ans0.add(matches[i][0]);
            }
            else if(map.get(matches[i][0]) == 1) {
                ans1.add(matches[i][0]);
            }
            if(map.get(matches[i][1]) == 1) {
                ans1.add(matches[i][1]);
            }
        }
        ans.add(new ArrayList(ans0.stream().collect(Collectors.toList())));
        ans.add(new ArrayList(ans1.stream().collect(Collectors.toList())));
        return ans;
    }
}