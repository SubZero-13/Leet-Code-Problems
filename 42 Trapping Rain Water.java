class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int max = height[0];
        left[0] = height[0];
        for(int i = 1; i < n; i++) {
            if(max >= height[i]) {
                left[i] = max;
            }
            else {
                left[i] = height[i];
                max = height[i];
            }
        }
        int right[] = new int[n];
        max = height[n-1];
        right[n-1] = height[n-1];
         for(int i = n-2; i >= 0; i--) {
            if(max >= height[i]) {
                right[i] = max;
            }
            else {
                right[i] = height[i];
                max = height[i];
            }
        }
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += (Math.min(left[i], right[i]) - height[i]);
        }
        return total;
    }
}