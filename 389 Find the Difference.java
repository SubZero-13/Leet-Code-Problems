class Solution {
    public char findTheDifference(String s, String t) {
        String res = s+t;
        int pos = 0;
        int [] freq = new int[26];
        for(int i = 0; i < res.length(); i++)
        {
            freq[res.charAt(i) - 'a']++;
        }
        for(int i = 0; i < freq.length; i++)
        {
            if(freq[i] % 2 != 0)
            {
                pos = i;
                break;
            }
        }
        char ch = (char) (pos + 97);
        return ch;
    }
}