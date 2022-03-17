class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = -1;
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int temp = map.get(s.charAt(i));
                len = Math.max(len, i-temp-1);
            }
            else {
                map.put(s.charAt(i), i);
            }
        }
        return len;
    }
}