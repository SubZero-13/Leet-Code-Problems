class Solution {
    public String decodeString(String s) {
        Stack<Integer> countSt = new Stack<>();
        Stack<String> strSt = new Stack<>();
        String ans = "";
        int i = 0;
        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))){
                int count = 0;
                while(Character.isDigit(s.charAt(i))) {
                    count = 10*count + (s.charAt(i) - '0');
                    i++;
                }
                countSt.push(count);
            }
            else if(s.charAt(i) == '[') {
                strSt.push(ans);
                ans = "";
                i++;
            }
           else if(s.charAt(i) == ']') {
               StringBuilder temp = new StringBuilder(strSt.pop());
               int repeat = countSt.pop();
               for(int j = 0; j < repeat; j++) {
                   temp.append(ans);
               }
               ans = temp.toString();
               i++;
           }
            else {
                ans += s.charAt(i++);
            }
        }
        return ans;
    }
}