class Solution {

    public String pushDominoes(String dominoes) {
        String d = "L" + dominoes + "R";
        StringBuilder ans = new StringBuilder();
        for(int i = 0, j  = 1; j < d.length(); ++j) {
            if (d.charAt(j) == '.') continue;
            int mid = j - i - 1;
            if (i > 0) ans.append(d.charAt(i));
            if (d.charAt(i) == d.charAt(j)) {
                for (int k = 0; k < mid; k++) {
                    ans.append(d.charAt(i));
                }
            } else if (d.charAt(i) == 'L' && d.charAt(j) == 'R') {
                for (int k = 0; k < mid; k++) {
                    ans.append(".");
                }
            } else {
                for (int k = 0; k < mid/2; k++) {
                    ans.append("R");
                }
                if (mid % 2 == 1) {
                    ans.append(".");
                }
                for (int k = 0; k < mid/2; k++) {
                    ans.append("L");
                }
            }
            i = j;
        }
        return ans.toString();
    }
}