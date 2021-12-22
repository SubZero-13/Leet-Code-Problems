class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < num.length(); i++)
        {
            char ch = num.charAt(i);
            while(st.size() > 0 && k > 0 && st.peek() > ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0)
        {
            st.pop();
            k--;
        }
        char [] ans = new char[st.size()];
        int j = ans.length-1;
        while(j>=0)
        {
            ans[j]=st.pop();
            j--;
        }
        int h = 0;
        while(h<ans.length && ans[h] == '0')
        {
            h++;
        }
        StringBuilder res = new StringBuilder();
        while(h < ans.length)
        {
            res.append(ans[h]);
            h++;
        }
        if(res.length()==0)
            res.append("0");
        return res.toString();
    }
}