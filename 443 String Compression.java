class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        int j=0;
        int len= chars.length;
        while(i<len)
        {
            while(j<len && chars[j]==chars[i])
                j++;
            int count = j-i;
            chars[index++]=chars[i];
            if(count>1)
            {
                for(char c : String.valueOf(count).toCharArray())
                    chars[index++]=c;
            }
            i=j;
        }
        return index;
    }
}