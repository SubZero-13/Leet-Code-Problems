class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0 || height.length == 0)
        {
            return 0;
        }
        int i = 0;
        int j = height.length-1;
        int max_area= 0;
        while(i < j)
        {
            int lh = height[i];
            int rh = height[j];
            int min_h = Math.min(lh, rh);
            max_area = Math.max(max_area, min_h*(j-i));
            if(lh <= rh)
                i++;
            else
                j--;
        }
        return max_area;
    }
}