class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == Integer.MIN_VALUE)
        return 1;
    if(divisor < 0  && dividend == Integer.MIN_VALUE)
        return Integer.MAX_VALUE / Math.abs(divisor);
    return dividend/ divisor;
    }
}