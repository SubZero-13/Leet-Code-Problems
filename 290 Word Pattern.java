class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] map = new String[26];
        String[] str = s.split(" ");
        Set<String> set = new HashSet<>();
        if(pattern.length() != str.length) return false;
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map[ch-'a'] != null) {
                if(!map[ch-'a'].equals(str[i])) return false;
            }
            else {
                if(set.contains(str[i])) return false;
                map[ch-'a'] = str[i];
                set.add(str[i]);
            }
            
        }
        return true;
    }
}