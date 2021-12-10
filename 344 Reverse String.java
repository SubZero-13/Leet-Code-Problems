class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        if(n % 2 == 0)
        {
            for(int i = 0; i < n/2; i++)
            {
                char c = s[i];
                s[i] = s[n-1-i];
                s[n-1-i] = c;
            }
        }
        else
        {
            for(int i = 0; i <= n/2; i++)
            {
                char c = s[i];
                s[i] = s[n-1-i];
                s[n-1-i] = c;
            }
        }
    }
}