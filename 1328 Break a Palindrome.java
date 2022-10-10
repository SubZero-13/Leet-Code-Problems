class Solution {
    public String breakPalindrome(String palindrome) {
        char ch[] = palindrome.toCharArray();
        int len = ch.length;
        for(int i = 0; i < len/2; i++) {
            if(ch[i] != 'a') {
                ch[i] = 'a';
                return String.valueOf(ch);
            }
        }
        ch[len-1] = 'b';
        return len < 2? "" : String.valueOf(ch);
    }
}