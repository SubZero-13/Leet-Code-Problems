class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int capLeft[] = new int[n];
        for(int i = 0; i < n; i++) {
            capLeft[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(capLeft);
        int ans = 0;
        for(int i = 0; i < n && additionalRocks > 0; i++) {
            if(capLeft[i] == 0) {
                ans += 1;
                continue;
            }
            else {
                if(additionalRocks >= capLeft[i]){
                    additionalRocks -= capLeft[i];
                    ans += 1;
                }
                else {
                    break;
                }
            }
        }
        return ans;
    }
}