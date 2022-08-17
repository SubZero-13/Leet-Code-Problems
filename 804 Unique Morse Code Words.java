class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morseCode[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        
        for(String s: words) {
            String str = "";
            for(char ch: s.toCharArray()) {
                str += morseCode[ch-'a'];
            }
            set.add(str);
        }
        
        return set.size();
    }
}