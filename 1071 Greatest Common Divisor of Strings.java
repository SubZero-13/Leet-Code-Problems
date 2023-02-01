class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s1 = str1 + str2;
        String s2 = str2 + str1;
        if(!s1.equals(s2)) return "";
        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}