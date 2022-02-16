class Solution {
    public String count(String s) {
        int count = 1;
        String s1 = "";
        for(int i = 0; i < s.length(); i++) {
            if((i+1) != s.length() && s.charAt(i) == s.charAt(i+1))
            {
                count++;
            }
            else {
                s1 = s1 + (char)(count + '0') + s.charAt(i);
                count = 1;
            }
        }
        return s1;
    }
    public String say(int n) {
        if(n == 1) {
            return "1";
        }
        String s = say(n-1);
        return count(s);
    }
    public String countAndSay(int n) {
        return say(n);
    }
}