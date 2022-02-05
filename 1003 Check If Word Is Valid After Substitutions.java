class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'c') {
                if(st.size() >= 2 && st.pop() == 'b' && st.pop() == 'a') {
                    
                } 
                else {
                    return false;
                }
            }
            else {
                st.push(ch);
            }
        }
        return st.size() == 0;
    }
}