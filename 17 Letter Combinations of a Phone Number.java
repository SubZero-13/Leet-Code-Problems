class Solution {
   public void getCombo(String keypad[], String s, int idx, String combo, List<String> ans) {
        if(idx == s.length()) {
            ans.add(combo);
            return;
        }
        char currChar = s.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i = 0; i < mapping.length(); i++) {
            getCombo(keypad, s, idx+1, combo+mapping.charAt(i), ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) {
            return ans;
        }
        String keypad[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        getCombo(keypad, digits, 0, "", ans);
        return ans;
    }
}
