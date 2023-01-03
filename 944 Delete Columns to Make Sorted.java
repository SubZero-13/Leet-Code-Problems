class Solution {
    public int minDeletionSize(String[] strs) {
        int m = strs.length;
        int n = strs[0].length();
        int ans = 0;
        int[][] mat = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = strs[i].charAt(j)-'a';
            }
        }
        for(int j = 0; j < n; j++) {
            for(int i = 1; i < m; i++) {
                if(mat[i][j] < mat[i-1][j]) {
                    ans += 1;
                    break;
                }
            }
        }
        return ans;
        
    }
}