class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length-1;
        int score = 0, res = 0;
        while(i <= j) {
            if(power >= tokens[i]) {
                power -= tokens[i];
                res = Math.max(res, ++score);
                i++;
            }
            else if(score > 0) {
                power += tokens[j];
                score -= 1;
                j--;
            }
            else {
                break;
            }
        }
        return res;
    }
}