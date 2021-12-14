public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first = 0, last = n-1, mid;
        while(true)
        {
            mid = first + (last-first)/2;
            int ans = guess(mid);
            if(ans==1)
            {
                first = mid+1;
            }
            else if(ans==-1)
            {
                last = mid-1;
            }
            else
            {
                return mid;
            }
        }
       
    }
}