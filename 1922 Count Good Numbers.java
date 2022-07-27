class Solution {
    int mod=(int)1e9+7;
    private long power(long a, long r) {
        if(r == 0) {
            return 1;
        }
        if(r == 1) {
            return a%mod;
        }
        long temp = power(a, (r/2));
        if(r%2 == 0) {
            return (temp * temp) % mod;
        }
        return (a*temp*temp)%mod;
    }
    public int countGoodNumbers(long n) {
        long first = (n%2 == 0? (n/2): (n/2)+1);
        long sec = (n/2);
        long mul1 = power(5, first);
        long mul2 = power(4, sec);
        long ans = 1;
        ans = (ans*mul1) % mod;
        ans = (sec != 0) ? (ans*mul2)%mod : ans;
        return (int)(ans%mod);
        
    }
}