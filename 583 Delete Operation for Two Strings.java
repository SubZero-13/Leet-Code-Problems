class Solution {
    // DP with Memoization TOP DOWN APPROACH

    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return f(word1.length()-1, word2.length()-1, word1, word2);
    }
    public int f(int i, int j, String str1, String str2) {
        if(i < 0) return j+1;
        if(j < 0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(str1.charAt(i) == str2.charAt(j)) return dp[i][j] = f(i-1, j-1, str1, str2);
        else return dp[i][j] = 1 + Math.min(f(i, j-1, str1, str2), f(i-1, j, str1, str2));
    }
}