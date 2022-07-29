class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int arr[] = mapping(pattern);
        List<String> ans = new ArrayList<>();
        for(String w: words) {
            if(Arrays.equals(mapping(w), arr)) {
                ans.add(w);
            }
        }
        return ans;
    }
    private int[] mapping(String w) {
        Map<Character, Integer> map = new HashMap<>();
        int n = w.length();
        int res[] = new int[n];
        for(int i = 0; i < n; i++) {
            map.putIfAbsent(w.charAt(i), map.size());
            res[i] = map.get(w.charAt(i));
        }
        return res;
    }
}