class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String s: tokens) {
            if(s.equals("+")) {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int res = b+a;
                st.push(String.valueOf(res)); 
            }
            else if(s.equals("-")) {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int res = b-a;
                st.push(String.valueOf(res));
            }
            else if(s.equals("*")) {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int res = b*a;
                st.push(String.valueOf(res));
            }
            else if(s.equals("/")) {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int res = b/a;
                st.push(String.valueOf(res));
            }
            else {
                st.push(s);
            }
        }
        return Integer.parseInt(st.peek());
    }
}