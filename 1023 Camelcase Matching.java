class Solution {
    private static Boolean isMatch(char[] queryArr, char[] pattArr)
    {
        int j = 0;
        for(int i = 0; i < queryArr.length; i++)
        {
            if(j < pattArr.length && queryArr[i] == pattArr[j])
            {
                j++;
            }
            else if(queryArr[i] >= 'A' && queryArr[i] <= 'Z')
            {
                return false;
            }
        }
        return j == pattArr.length;
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<Boolean>();
        char [] pattArr = pattern.toCharArray();
        for(String query: queries)
        {
            char [] queryArr = query.toCharArray();
            ans.add(isMatch(queryArr, pattArr));
        }
        return ans;
    }
}