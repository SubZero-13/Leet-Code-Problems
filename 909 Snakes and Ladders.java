class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[][] visited = new boolean[n][n];
        int min = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                int currVal = q.poll();
                if(currVal == n*n) return min;
                for(int i = 1; i <= 6; i++) {
                    if(i+currVal > n*n) continue;
                    int[] pos = findCordinates(i+currVal, n);
                    int row = pos[0];
                    int col = pos[1];
                    if(visited[row][col]) continue;

                    visited[row][col] = true;
                    if(board[row][col] == -1) q.add(i+currVal);
                    else q.add(board[row][col]); 
                }
            }
            min++;
        }
        return -1;
    }
    private int[] findCordinates(int currVal, int n) {
        int r = n-(currVal-1)/n - 1;
        int c = (currVal-1) % n;
        if(r%2 == n%2) return new int[]{r, n-1-c};

        return new int[]{r, c};
    }
}