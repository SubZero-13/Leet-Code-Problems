class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        int result;
        while(n > 0)
        {
            int rem = 0;
            rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        result = product - sum;
        return result;
    }
}