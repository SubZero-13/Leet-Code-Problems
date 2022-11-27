class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int leftMin[] = new int[len];
        int rightMin[] = new int[len];
        for(int i = 0; i < len; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                leftMin[i] = -1;
            }
            else {
                leftMin[i] = s.peek();            
            }
            s.push(i);
        }
        s.clear();
        for(int i = len-1; i >= 0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                rightMin[i] = len;
            }
            else {
                rightMin[i] = s.peek();            
            }
            s.push(i);
        }
        int area = 0;
        for(int i = 0; i < len; i++) {
            int tempA = heights[i] * (rightMin[i]-leftMin[i]-1);
            area = Math.max(area, tempA);
        }
        return area;
    }
}