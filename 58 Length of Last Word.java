class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length()-1;
        if(s.charAt(i) == ' ')
           {
               while(s.charAt(i) == ' ')
               {
                   i--;
               }
           }
        while(s.charAt(i) != ' ')
        {
            length++;
            i--;
            if(i < 0)
            {
                break;
            }
        }
        return length;
    }
}