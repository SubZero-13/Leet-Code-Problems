class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long A = a, B = b;
        long mod = (long)(Math.pow(10, 9) + 7);
        long left = Math.min(a, b);
        long rigth = (long)n*Math.min(a,b); 
        //Calculating GCD(formula)
        while(B > 0)
        {
            long temp = A;
            A = B;
            B = temp % B;
        }
        long lcm = (a*b)/A;
        while(left < rigth)
        {
            long mid = left + (rigth-left)/2;
            long x = (mid/a)+(mid/b)-(mid/lcm);
            if(x < n)
                left = mid+1;
            else
                rigth = mid;
        }
        return (int)(left%mod);
    }
}