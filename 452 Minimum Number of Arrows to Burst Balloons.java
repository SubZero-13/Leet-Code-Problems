class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> a[1]-b[1]);
        
        int ans = 0;
        int x = points[0][1];
        for(int i = 1; i < points.length; i++) {
            if(x >= points[i][0] && x <= points[i][1]) {
                continue;
            }
            else {
                ans += 1;
                x = points[i][1];
            }
        }
        return (ans+1);
    }
}