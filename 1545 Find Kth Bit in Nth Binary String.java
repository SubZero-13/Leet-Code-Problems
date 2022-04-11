class Solution {
    public String reverseInvert(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            }
            else {
                sb.setCharAt(i, '0');
            }
        }
        return sb.toString();
    }
    public String helper(int n, int i, String ans) {
        if(i == n+1) {
            return ans;
        }
        String s = reverseInvert(ans);
        ans = ans + "1" + s;
        return helper(n, i+1, ans);
        
    }
    public char findKthBit(int n, int k) {
        String res = helper(n, 1, "0");
            return res.charAt(k-1);
    }
}