class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int xAxis[] = new int [points.length];
        for(int i = 0; i < points.length; i++) {
            xAxis[i] = points[i][0];
        }
        Arrays.sort(xAxis);
        int widVerArea = -1;
        for(int i = 0; i < xAxis.length-1; i++) {
            widVerArea = Math.max(widVerArea, xAxis[i+1]-xAxis[i]);
        }
        return widVerArea;
    }
}