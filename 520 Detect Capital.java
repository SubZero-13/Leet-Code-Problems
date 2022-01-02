class Solution {
    public boolean detectCapitalUse(String word) {
         String to_compare = word;
        if(to_compare.toLowerCase().equals(word)) {
            return true;
        }
        if(to_compare.toUpperCase().equals(word)) {
            return true;
        }
        if(((int) to_compare.charAt(0) >= 65 && (int) to_compare.charAt(0) <= 90) && to_compare.toLowerCase().substring(1).equals(word.substring(1))) {
            return true;
        }
        return false;
    }
}