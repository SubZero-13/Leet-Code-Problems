class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int next[] = getNext(s);
        int length = s.length();
        if(next[length-1] == -1) return false;
        else if(length % (length - next[length-1] - 1) == 0) {
            return true;
        }
        return false;
    }
    
     public int[] getNext(String needle) {
        int next[] = new int[needle.length()];
        int j = -1;
        next[0] = j;
        for(int i = 1; i < needle.length(); i++) {
            while(j >=0 && needle.charAt(i) != needle.charAt(j + 1)) j = next[j];
            if(needle.charAt(i) == needle.charAt(j + 1)) j++;
            next[i] = j;
        }
        return next;
    }
}