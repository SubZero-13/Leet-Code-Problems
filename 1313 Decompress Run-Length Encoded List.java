class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        int i = 0;
        while (i < nums.length)
        {
            size += nums[i];
            i += 2;
        }
        int [] result = new int [size];
        i = 0;
        int index = 0;
        while(i < nums.length-1)
        {
            int freq = nums[i];
            int val = nums[i+1];
            for(int k = 0; k < freq; k++)
            {
                result[index] = val;
                index++;
            }
            i += 2;
        }
        return result;
    }
}