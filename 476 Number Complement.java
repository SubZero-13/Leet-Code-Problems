class Solution {
    public int findComplement(int num) {
      int temp = num , i = 0;
        while(temp > 0) {
            num ^= (1 << i);
            temp >>= 1;
            ++i;
        }
        return num;
        
    }
}