class Solution {
    public String reverseVowels(String s) {
        char result[] = s.toCharArray();
        int i = 0;
        int j = result.length-1;
        int lcount = 0;
        int rcount = 0;                                                   while(i <= j)
        {
            if(result[i] == 'a' || result[i] == 'e' || result[i] == 'i' || result[i] == 'o' || result[i] == 'u' || result[i] == 'A' || result[i] == 'E' || result[i] == 'I' || result[i] == 'O' || result[i] == 'U')
            {
               lcount = 1;
            }
            if(result[j] == 'a' || result[j] == 'e' || result[j] == 'i' || result[j] == 'o' || result[j] == 'u' || result[j] == 'A' || result[j] == 'E' || result[j] == 'I' || result[j] == 'O' || result[j] == 'U')
            {
                rcount = 1;
            }
            if(lcount == 1 && rcount == 1)
            {
                char temp = result[i];
                result[i] = result[j];
                result[j] = temp;
                lcount = 0;
                rcount = 0;
               
            }
                if(lcount != 1)
                {
                    i++;
                }
                if(rcount != 1)
                {
                    j--;
                }
           
            }
        return String.copyValueOf(result);
           
    }
}