class Solution {
    public int findJudge(int n, int[][] trust) {
         int[] count=new int[n+1];
        for(int[] i : trust)
        {
            count[i[0]]--;
            count[i[1]]++;
        }
            for(int j=1 ; j<=n ;j++)
            {
                if(count[j]==n-1)
                    return j;
            }
        return -1;
    }
}