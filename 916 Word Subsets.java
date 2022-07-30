class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26], temp;
        int i;
        for(String s: words2)  {
            temp = counter(s);
            for(i = 0; i < 26; i++) {
                count[i] = Math.max(temp[i], count[i]);
            }
        }  
        for(String s: words1) {
            temp = counter(s);
            for(i = 0; i < 26; i++) {
                if(temp[i] < count[i])
                    break;
            }
            if(i == 26)
                ans.add(s);
        }
         return ans;
    }
    private int[] counter(String s) {
        int[] temp = new int[26];
        for(char c: s.toCharArray()) {
            temp[c-'a']++;
        }
        return temp;
    }
}