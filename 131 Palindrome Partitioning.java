class Solution {
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        helper(s, new ArrayList<String>());
        return ans;
    }
    private void helper(String s, List<String> list) {
        if(s == null || s.length() == 0) {
            ans.add(new ArrayList(list));
            return;
        }

        for(int i = 1; i <= s.length(); i++) {
            String str = s.substring(0, i);
            if(!isPalindrome(str)) continue;
            list.add(str);
            helper(s.substring(i, s.length()), list);
            list.remove(list.size()-1);
        }
    }
    private boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}