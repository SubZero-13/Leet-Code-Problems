class Solution {
    public int firstUniqChar(String s) {
         int[] c = new int[(int)'z'+1];
      int[] ch = new int[s.length()];  
        int i =0;
      for(int cha: s.toCharArray()){
          c[cha]++;
          ch[i++] = cha;
      }  
        
        for( i = 0; i < s.length();i++ ){
            if(c[ch[i]]==1){
                return i;
            }
        }
        
        return -1;
    }
}