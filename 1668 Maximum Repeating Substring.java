class Solution {
    public int maxRepeating(String sequence, String word) {
       int ans = 1;
       while(sequence.contains(word.repeat(ans))) {
           ans += 1;
       }
       return ans-1;
    }
}