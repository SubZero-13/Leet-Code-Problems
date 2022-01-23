class Solution {
    public int maxDepth(String s) {
        int res = 0, curr = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                curr++;
                res = Math.max(res, curr);
            }
            if(s.charAt(i) == ')')
            {
                curr--;
            }
        }
        return res;
    }
}