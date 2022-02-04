class Solution {
    /*
    public boolean solution1(String s1, String s2, String s3, int i, int j) {
        if(i == s1.length() && j == s2.length()) {
            return true;
        }
        if(i < s1.length() && s1.charAt(i) == s3.charAt(i+j)) {
            boolean f1 = solution1(s1, s2, s3, i+1, j);
            if(f1 == true) {
                return true;
            }
        }
        if(j < s2.length() && s2.charAt(j) == s3.charAt(i+j)) {
            boolean f2 = solution1(s1, s2, s3, i, j+1);
            if(f2 == true) {
                return true;
            }
        }
        return false;
    }
    */
    public boolean isInterleave(String s1, String s2, String s3) {
        /*Method 1: Using Recurssion
        if((s1.length() + s2.length()) != s3.length()) {
            return false;
        }
        return solution1(s1, s2, s3, 0, 0);
        */
        if((s1.length() + s2.length()) != s3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                if(i== 0 && j == 0) {
                    dp[i][j] = true;
                }
                else if(i == 0) {
                    dp[i][j] = s2.charAt(j-1) == s3.charAt(j+i-1) ? dp[i][j-1] : false;
                }
                else if(j == 0) {
                    dp[i][j] = s1.charAt(i-1) == s3.charAt(i+j-1) ? dp[i-1][j] : false;
                }
                else {
                    if(s1.charAt(i-1) == s3.charAt(i+j-1)) {
                        dp[i][j] = dp[i-1][j];
                    }
                    if(!dp[i][j] && s2.charAt(j-1) == s3.charAt(i+j-1)) {
                        dp[i][j] = dp[i][j-1];
                    }
                } 
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}