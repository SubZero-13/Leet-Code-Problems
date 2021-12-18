class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int l = 0, r = letters.length, mid;
        if(target >= letters[letters.length-1])
            return letters[0];
        while(l < r){
            mid = l + (r - l)/2;
            if(letters[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        return letters[l];
    }
}