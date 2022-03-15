class Solution {
    public int helper(int n, int arr[]) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        if(arr[n] != 0) {
            return arr[n];
        }
        int way1 = helper(n-1, arr);
        int way2 = helper(n-2, arr);
        arr[n] = way1 + way2;
        return way1 + way2;
    }
    public int climbStairs(int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
       return helper(n, new int[n+1]);
    }
}
