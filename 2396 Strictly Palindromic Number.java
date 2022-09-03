class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binary);
        if(sb.toString() != sb.reverse().toString()) {
            return false;
        }
        int temp = n-2;
        if(binary.length() < temp) {
            temp = binary.length()-1;
        }
        for(int i = temp; i > 0; i--) {
            StringBuilder sb1 = new StringBuilder(binary.substring(0, i));
            if(sb1.toString() != sb1.reverse().toString()) {
                return false;
            }
        }
        return true;
    }
}