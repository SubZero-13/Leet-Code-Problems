class Solution {
    public int minFlipsMonoIncr(String s) {
        if(s.length() == 0) return 0;
        int flipCount = 0, onesCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                if(onesCount == 0) continue;
                else {
                    flipCount++;
                }
            }
            else {
                onesCount++;
            }
            if(flipCount > onesCount) {
                flipCount = onesCount;
            }
        }
        return flipCount;
    }
}