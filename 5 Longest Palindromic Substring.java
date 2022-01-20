class Solution {
    public String longestPalindrome(String s) {
         boolean dp[][] = new boolean[s.length()][s.length()];
        int maxlen = 0, start = 0;
        for(int gap = 0; gap < s.length(); gap++)
        {
            for(int i = 0, j = gap; j < s.length(); i++, j++)
            {
                if(gap == 0)
                {
                    dp[i][j] = true;
                }
                else if(gap == 1)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                else
                {
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true)
                    {
                        dp[i][j] = true;
                    }
                    else
                    {
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j])
                {
                   start = i;
                   maxlen = j;
                }
            }
        }
        String subString = "";
        for(int k = start; k <= maxlen; k++)
        {
            subString = subString + s.charAt(k);
        }
        return subString;
    }
}