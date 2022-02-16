class Solution {
    public int countPrimes(int n) {
        boolean isPrime[] = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime[i] == false)
                count++;
            for(int j = 2; i*j < n; j++) {
                isPrime[i*j] = true;
            }
        }
        return count;
    }
}