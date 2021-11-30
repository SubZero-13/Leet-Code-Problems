class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int x:arr)
        {
            sum += x;
        }
        if(sum % 3 != 0)
        {
            return false;
        }
        sum = sum/3;
        int subsum = 0;
        int count = 0;
        for(int x : arr)
        {
            subsum += x;
            if(subsum == sum)
            {
                count++;
                subsum = 0;
            }
        }
        if(count >= 3)
        {
            return true;
        }
        return false;
    }
}