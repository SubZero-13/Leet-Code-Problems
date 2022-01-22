class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
       int [] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++)
        {
            int [] query = queries[i];
            int count  = 0;
            for(int[] point: points)
            {
                int x = point[0] - query[0];
                int y = point[1] - query[1];
                if((x*x + y*y) <= (query[2]*query[2]))
                {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}