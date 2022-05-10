class Solution {
    public String sortSentence(String s) {
        String str[] = s.split(" ");
        String ans[] = new String[str.length+1];
        for(int i = 0; i < str.length; i++) {
            int idx = Integer.parseInt(String.valueOf(str[i].charAt(str[i].length()-1)));
            ans[idx] = str[i];
        }
        String res = "";
        for(int i = 1; i < ans.length-1; i++) {
            res += ans[i].substring(0, ans[i].length()-1) + " ";
        }
        res += ans[ans.length-1].substring(0, ans[ans.length-1].length()-1);
        return res;
    }
}