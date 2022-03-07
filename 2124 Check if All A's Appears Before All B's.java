class Solution {
    public boolean checkString(String s) {
//         Method 1 -->
//         Stack<Character> st = new Stack<>();
//         int i = 0;
//         while(i < s.length()) {
//             if(s.charAt(i) == 'b') {
//                 break;
//             }
//             st.push(s.charAt(i));
//             i++;
//         }
//         if(i == s.length()) {
//             return true;
//         }
//         while(i < s.length()) {
//             if(s.charAt(i) == 'a') {
//                 return false;
//             }
//             st.push(s.charAt(i));
//             i++;
//         }
//         return true;
        
//         Method 2-->
        return !s.contains("ba");
    }
}