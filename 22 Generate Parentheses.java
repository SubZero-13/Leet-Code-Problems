class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        helper(ans, "", 0, 0, n);
        return ans;
    }
    public void helper(List<String> ans, String s, int open, int close, int n)     {
        if(s.length() == n*2) {
            ans.add(s);
            return;
        }
        if(open < n) {
            helper(ans, s+"(", open+1, close, n);
        }
        if(close < open) {
            helper(ans, s+")", open, close+1, n);
        }
    }
}