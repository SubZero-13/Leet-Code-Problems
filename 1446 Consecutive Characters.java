class Solution {
    public int maxPower(String s) {
        int ans = 0,cnt = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                cnt++;
            else{
                ans = Math.max(ans,cnt);
                cnt = 1;
            }
        }
        return Math.max(ans,cnt);
    }
}