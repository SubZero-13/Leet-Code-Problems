class Solution {
    public int minPartitions(String n) {
        
        // Method - 1
        // int res = 0;
        // int max = 0;
        // char[] charArr = n.toCharArray();
        // for(char c: charArr)
        // {
        //     max = Character.getNumericValue(c);
        //     res = Math.max(max, res);
        // }
        // return res;
        
        // Method - 2
        return n.chars().max().getAsInt() - '0';
    }
}
