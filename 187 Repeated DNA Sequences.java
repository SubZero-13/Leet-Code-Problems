class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> ans = new HashSet<>();
        int i = 0;
        int j = 10;
        while(j <= s.length()) {
            String str = s.substring(i, j);
            if(set.contains(str)) {
                ans.add(str);
            }
            set.add(str);
            i++;
            j++;
        }
        return new ArrayList<>(ans);
    }
}