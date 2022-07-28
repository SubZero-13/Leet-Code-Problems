class Solution {
        public boolean parseBoolExpr(String expression) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);
            if (c == ')') {
                Set<Character> seen = new HashSet<>();
                while (stk.peek() != '(')
                    seen.add(stk.pop());
                stk.pop();
                char operator = stk.pop(); 
                if (operator == '&') {
                    stk.push(seen.contains('f') ? 'f' : 't'); 
                }else if (operator == '|') {
                    stk.push(seen.contains('t') ? 't' : 'f'); 
                }else { 
                    stk.push(seen.contains('t') ? 'f' : 't'); 
                }
            }else if (c != ',') {
                stk.push(c);
            }
        }
        return stk.pop() == 't';
    }
    
    // Recursive Solution Faster than Iterative
    // public boolean parseBoolExpr(String expression) {
    //     return parse(expression, 0, expression.length());
    // }
    // private boolean parse(String s, int lo, int hi) {
    //     char c = s.charAt(lo);
    //     if (hi - lo == 1) return c == 't'; // base case.
    //     boolean ans = c == '&'; // only when c is &, set ans to true; otherwise false.
    //     for (int i = lo + 2, start = i, level = 0; i < hi; ++i) {
    //         char d = s.charAt(i);
    //         if (level == 0 && (d == ',' || d == ')')) { // locate a valid sub-expression. 
    //             boolean cur = parse(s, start, i); // recurse to sub-problem.
    //             start = i + 1; // next sub-expression start index.
    //             if (c == '&') ans &= cur;
    //             else if (c == '|') ans |= cur;
    //             else ans = !cur; // c == '!'.
    //         }
    //         if (d == '(') ++level;
    //         if (d == ')') --level;
    //     }
    //     return ans;
    // }
}