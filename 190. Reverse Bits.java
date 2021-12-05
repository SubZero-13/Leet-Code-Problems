public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int match = 1;
        long result = 0;
        for(int i=31; i>= 0; i--){
            if((match & n) != 0){
                result += Math.pow(2, i);
            }
            match <<= 1;
        }
        return (int)result;
    }
}