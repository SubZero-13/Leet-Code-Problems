class Solution {
    public int reverse(int x) {
        int rem = 0;
        int temp = x;
        long sum = 0;
        while(temp != 0)
        {
            rem = temp % 10;
            sum = (sum*10) + rem;
            temp = temp / 10;
        }
        if(sum > ((int)Math.pow(2, 31) - 1) || sum < ((-1)*(int)Math.pow(2, 31)))
        {
            return 0;
        }
     
        return (int)sum;
    }
}