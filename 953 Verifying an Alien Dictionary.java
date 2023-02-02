class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        // Arrays.fill(freq, -1);
        for(int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            index[ch-'a'] = i;
        }
        for(int i = 1; i < words.length; i++) {
            String word = words[i];
            String temp = words[i-1];
            int idx = 0;
            boolean flag = true;
            while(idx < word.length() && idx < temp.length()) {
                char ch1 = word.charAt(idx);
                char ch2 = temp.charAt(idx);
                if(ch1 != ch2 && index[ch2-'a'] > index[ch1-'a']) {
                    return false;
                }
                else if(ch1 != ch2 && index[ch2-'a'] <= index[ch1-'a']){
                    flag = false;
                    break;
                }
                idx++;
            }
            if(flag) {
                if(temp.length() > word.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}