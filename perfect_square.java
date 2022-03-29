class Solution {
    public int numSquares(int n) {
         int res[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            res[i]=i;
            for(int j=1;j*j<=i;j++)
            {
                res[i]=Math.min(res[i-j*j]+1,res[i]);
            }
        }
        return res[n];
        
    }
}