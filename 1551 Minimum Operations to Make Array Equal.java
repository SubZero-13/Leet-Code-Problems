class Solution {
    public int minOperations(int n) {
        // if(n == 0 || n == 1) {
        //     return 0;
        // }
        // int minOp = 0;
        // while(n > 1) {
        //     minOp += (n-1);
        //     n = n-2;
        // }
        // return minOp;
        return n*n/4;
    }
}