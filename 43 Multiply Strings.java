class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
        {
            return "0";
        }
            
       int l1 = num1.length();
        int l2 = num2.length();
        int result[] = new int[l1+l2];
        int pf = 0;
        int i = l2-1;
        while(i >= 0)
        {
            int ival = num2.charAt(i)-'0';
            i--;
            int j = l1-1;
            int carry = 0;
            int k = result.length-1-pf;
            while(j >= 0 || carry != 0)
            {
                int jval = j>= 0 ? num1.charAt(j)-'0' : 0;
                j--;
                int prod = ival*jval+carry+result[k];
               
                result[k] = prod%10;
                carry = prod / 10;
                 k--;
            }
            pf++;
        }
        boolean flag = false;
        String str = "";
        for(int l = 0; l < result.length; l++)
        {
            if(result[l] == 0 && flag == false)
            {
                continue;
            }
            else
            {
                flag = true;
                str += result[l];
            }
        }
        return str;
        
    }
}