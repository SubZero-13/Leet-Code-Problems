class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*') {
                String a = expression.substring(0, i);
                String b = expression.substring(i+1);
                List<Integer> leftExp = diffWaysToCompute(a);
                List<Integer> rightExp = diffWaysToCompute(b);
                for(int x: leftExp) {
                    for(int y: rightExp) {
                        switch(c) {
                                case '+': {
                                    res.add(x+y);
                                    break;
                                }
                                case '-': {
                                    res.add(x-y);
                                    break;
                                }
                            case '*': {
                                    res.add(x*y);
                                    break;
                                }
                    }
                }
            }
        } 
      }
        if(res.size() == 0) 
            res.add(Integer.valueOf(expression));
        return res;
    }
}