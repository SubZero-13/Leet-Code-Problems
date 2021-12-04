class Solution {
    public String reverseStr(String s, int k) {
       if(k == 0)
            return s;
        int i = 0;
        char[] cs = s.toCharArray();

        while(i < cs.length) {
            reverse(cs, i, Math.min(i + k - 1, cs.length - 1));
            i += 2 * k;
        }

        return String.valueOf(cs);
    }

     public void reverse(char[] cs, int start, int end) {
        while(start < end) {
            char c = cs[start];
            cs[start] = cs[end];
            cs[end] = c;
            start++;
            end--;
        }
     }
}