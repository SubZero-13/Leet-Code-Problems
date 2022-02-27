class Solution {
    public int prefixCount(String[] words, String pref) {
        int lenOfPref = pref.length();
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() >= pref.length()) {
                String s = words[i].substring(0, lenOfPref);
                if(s.equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }
}