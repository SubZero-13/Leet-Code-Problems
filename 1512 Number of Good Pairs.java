class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0, count[] = new int[101];
        for(int x: nums)
        {
            count[x]++;
        }
        for(int x: count)
        {
            res += (x * (x-1))/2;
        }
        return res;
    }
}