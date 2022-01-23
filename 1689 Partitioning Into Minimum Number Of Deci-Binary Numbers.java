class Solution {
    public int minPartitions(String n) {
        int res = 0;
        int max = 0;
        char[] charArr = n.toCharArray();
        for(char c: charArr)
        {
            max = Character.getNumericValue(c);
            res = Math.max(max, res);
        }
        return res;
    }
}