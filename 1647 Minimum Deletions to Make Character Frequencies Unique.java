class Solution {
    public int minDeletions(String s) {
        int freq[] = new int[26], res = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i)
            ++freq[s.charAt(i) - 'a'];
        for (int i = 0; i < 26; ++i) {
            while (freq[i] > 0 && !set.add(freq[i])) {
                --freq[i];
                ++res;
            }
        }        
        return res;
    }
}