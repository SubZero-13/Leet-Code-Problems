class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(int i = 0; i < operations.length; i++)
        {
            String s = operations[i];
            for(int j = 0; j < s.length(); j++)
            {
                if(s.charAt(j) == '-')
                {
                    res -= 1;
                    break;
                }
                if(s.charAt(j) == '+')
                {
                    res += 1;
                    break;
                }
            }
        }
        return res;
    }
}