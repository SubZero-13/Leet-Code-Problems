class Solution {
    // public int bestTeamScore(int[] scores, int[] ages) {
    //     int n = ages.length;
    //     int[][] players = new int[n][2];
    //     for(int i = 0; i < n; i++) {
    //         players[i][0] = ages[i];
    //         players[i][1] = scores[i];
    //     }
    //     Arrays.sort(players, (a, b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);
    //     int[] dp = new int[n];
    //     Arrays.fill(dp, -1);
    //     int ans = 0;
    //     for(int i = 0; i < n; i++) {
    //        ans = Math.max(ans, helper(players, i, dp));
    //     }
    //     return ans;
    // }
    // private int helper(int[][] players, int idx, int[] dp) {
    //     if(dp[idx] != -1) return dp[idx];
    //     int max = players[idx][1];
    //     for(int i = idx+1; i < players.length; i++) {
    //         if(players[i][1] >= players[idx][1]) {
    //             max = Math.max(max, helper(players, i, dp) + players[idx][1]);
    //         }
    //     }
    //     return dp[idx] = max;
    // }

    // Bottom-Up Approach
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = ages.length;
        int[][] players = new int[n][2];
        for(int i = 0; i < n; i++) {
            players[i][0] = ages[i];
            players[i][1] = scores[i];
        }
        Arrays.sort(players, (a, b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);
        int[] dp = new int[n];
        int ans = dp[0] = players[0][1];
        for(int i = 1; i < n; i++) {
            dp[i] = players[i][1];
           for(int j = 0; j < i; j++) {
               if(players[j][1] <= players[i][1]) {
                   dp[i] = Math.max(dp[j]+players[i][1], dp[i]);
               }
           }
           ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}