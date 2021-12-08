class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
            for(int i = 1; i < strs.length; i++)
            {
                if(strs[i].length() < min)
                {
                    min = strs[i].length();
                }
            }
        String result = "";
        char ch; 
        for(int i = 0; i < min; i ++)
        {
            ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++)
            {
                if(strs[j].charAt(i) != ch)
                {
                    return result;
                }
            }
            result += (ch);
        }
        return result;
    }
}