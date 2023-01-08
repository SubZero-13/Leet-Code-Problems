// y = mx + c
// from geometry:
// Slope between Two Ponits (x1, y1) and (x2, y2)
// slope, m = (y2-y1) / (x2-x1)

// if slope between two points are same then it falls on the same line 
// By considering one points as base at a time we calculate the slope between all other points and
// Increase the frequency of the same slope and finally took a max variable to store on which line aximum points fall


class Solution {
    public int maxPoints(int[][] points) {
        if(points.length <= 2) return points.length;
        int max = 0;
        for(int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++) {
                if(i == j) continue;
                double slope = 0.0;
                if(points[i][0] == points[j][0]) {
                    slope = Double.POSITIVE_INFINITY;
                }
                else {
                    slope = (points[j][1] - points[i][1]) / (double)(points[j][0] - points[i][0]);
                }
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                if(map.get(slope) > max) {
                    max = map.get(slope);
                }
            }
        }
        return max+1;
    }
}