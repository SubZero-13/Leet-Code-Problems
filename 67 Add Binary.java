class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
    int i = a.length() - 1, j = b.length() -1,carry = 0;
    while (i >= 0 || j >= 0) {
        int sum = carry;
        
        if (j >= 0){
        
           int x = Character.getNumericValue(b.charAt(j)); 
           sum = sum + x;
        }
       if (i >= 0){
            int y = Character.getNumericValue(a.charAt(i)); 
            sum = sum + y ; 
        }
        sb.append(sum % 2);
        carry = sum / 2;
        j-=1;
        i-=1;
      
    }
    carry=carry%2;
    if (carry != 0){
        sb.append(1);
        }
    sb.reverse();  
    return sb.toString();
        
    }
}
