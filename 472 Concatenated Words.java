class Solution {
    Set<String> set;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        set = new HashSet<>();
        for(String word: words) {
            set.add(word);
        }
        for(String word: words) {
            if(isConcat(word)) ans.add(word);
        }
        return ans;
    }
    private boolean isConcat(String word) {
        int len = word.length();
        for(int i = 1; i < len; i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if(set.contains(prefix) && (set.contains(suffix) || isConcat(suffix))) {
                return true;
            }
        }
        return false; 
    }
}