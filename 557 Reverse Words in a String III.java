class Solution {
    public String reverseWords(String s) {
         String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i<arr.length;i++) {
            res.append(reverseWord(arr[i]));
            if (i < arr.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
    
    private String reverseWord(String s1) {
        char[] c = s1.toCharArray();
        int i = 0, j = c.length - 1;
        
        while (i < j) {
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
        return new String(c);
    }
}