//PepCoding
class Solution {
    // Using Memoization DP
    // public int helper(int n, int arr[]) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     if(n < 0) {
    //         return 0;
    //     }
    //     if(arr[n] != 0) {
    //         return arr[n];
    //     }
    //     int way1 = helper(n-1, arr);
    //     int way2 = helper(n-2, arr);
    //     arr[n] = way1 + way2;
    //     return way1 + way2;
    // }
    public int climbStairs(int n) {
       //  Using Memoization DP
       //  if(n == 0) {
       //      return 1;
       //  }
       //  if(n < 0) {
       //      return 0;
       //  }
       // return helper(n, new int[n+1]);
        
        //Using Tabulation Mehod
        
        // int arr[] = new int[n+1];
        // arr[0] = 1;
        // for(int i = 1; i < arr.length; i++) {
        //     if(i == 1) {
        //         arr[i] = arr[i-1];
        //     }
        //     else {
        //         arr[i] = arr[i-1] + arr[i-2];
        //     }
        // }
        // return arr[n];
        
        // Space Optimized Dp using tabulation DP
        int prev = 1;
        int prev2 = 1;
        for(int i = 2; i <= n; i++) {
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
        
    }
}
