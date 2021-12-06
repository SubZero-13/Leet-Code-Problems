class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.isEmpty() && needle.isEmpty())
        {
            return 0;
        }
       if(haystack == null || haystack.length() ==0) return -1;
        if (needle ==null || needle.length() ==0) return 0;
        
        
        int haystackLen = haystack.length();
        int needlelen = needle.length();
        for (int i =0; i < haystackLen - needlelen +1; i++){
            
            if (haystack.substring(i, i + needlelen).equals(needle)){
                return i;
            }
            
        }
        return -1;
    }
}