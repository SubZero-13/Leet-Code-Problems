class Solution {
    public int maxProduct(String[] words) {
        int value[] = new int[words.length];
        int res = 0;
        for(int i = 0; i < words.length; i++) {
            for(char ch: words[i].toCharArray()) {
                value[i] |= 1 << (ch-'a');
            }
            for(int j = 0; j < i; j++) {
                if((value[i] & value[j]) == 0) {
                    if(words[i].length()*words[j].length() > res) {
                        res = words[i].length()*words[j].length();
                    }
                }
            }
        }
        return res;
    }
}