class Solution {
    public boolean isHappy(int n) {
        int sq = 0, rem = 0;
       do
       {
           sq = 0;
           while( n != 0)
           {
               rem = n % 10;
               sq += rem * rem;
               n = n / 10;
           }
           n = sq;
       }while(n >= 7);
        if(n == 1)
        {
            return true;
        }
        return false;
    }
}