class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(3);
        char r1 = s.charAt(1);
        char r2 = s.charAt(4);
        for(char c = ch1; c <= ch2; c++) {
            for(char r  = r1; r <= r2; r++) {
                ans.add("" + c + r);
            }
        }
        return ans;
    }
}