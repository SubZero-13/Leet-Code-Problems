class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int res = 1;
        for(int i = 0; i < arr.length-1; i++) {
            max = Math.max(max, arr[i]);
            if(max <= i) {
                res++;
            }
        }
        return res;
    }
}