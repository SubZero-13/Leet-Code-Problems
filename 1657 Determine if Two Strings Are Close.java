class Solution {
    public boolean closeStrings(String word1, String word2) {
       int[] set1 = new int[26];
       int[] set2 = new int[26];
       int[] set3 = new int[26];
       int[] set4 = new int[26];

       for(char ch: word1.toCharArray()) {
           set1[ch-'a']++;
           set2[ch-'a'] = 1;
       }
       for(char ch: word2.toCharArray()) {
           set3[ch-'a']++;
           set4[ch-'a'] = 1;
       }
       Arrays.sort(set1);
       Arrays.sort(set3);
       return Arrays.equals(set1, set3) && Arrays.equals(set2, set4);
    }
}