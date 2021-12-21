class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i < j)
        {
            if(((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) && ((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= 'A' && ch[j] <= 'Z')))
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            else if((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
            {
                j--;
            }
            else if((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= 'A' && ch[j] <= 'Z'))
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
        }
        String ans = new String(ch);
        return ans;
    }
}