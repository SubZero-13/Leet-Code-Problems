public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int low =1;
         int hi = n;
         int mid = 0;
         int lastbad = -1;
         while(low<=hi)
         {
             
              mid = low + ((hi - low) / 2);
              if(isBadVersion(mid))
              {
                   hi = mid-1;
                  lastbad = mid;
              }
              else
              {
                 low = mid+1;
              }
        }
        return lastbad;
    }
}