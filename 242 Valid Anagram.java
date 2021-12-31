class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> mapS = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            mapS.put(c,mapS.getOrDefault(c,0) + 1);
        }
        
        for(int i = 0; i < t.length(); i++){
            char c2 = t.charAt(i);
            if(!mapS.containsKey(c2) || mapS.get(c2) == 0)
                return false;
            else{
                mapS.put(c2,mapS.get(c2)-1);
            }
        }
        return true;
    }
}