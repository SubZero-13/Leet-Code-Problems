class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[256];
        for(int i = 0; i < 256; i++)
        {
            freq[i] = -1;
        }
        int maxLen = 0, start = -1;
        for(int i = 0; i < s.length(); i++)
        {
            if(freq[s.charAt(i)] > start)
            {
                start = freq[s.charAt(i)];
            }
            freq[s.charAt(i)] = i;
            maxLen = Math.max(maxLen, i-start);
        }
        return maxLen;
    }
}