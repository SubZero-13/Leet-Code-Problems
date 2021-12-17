class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a[] = new int[129];
        for(int i=0;i<jewels.length();i++)
             a[(int)jewels.charAt(i)]++;
        int ans =0;
        for(int i=0;i<stones.length();i++){
            if(a[(int)stones.charAt(i)]>0)
                  ans = ans+1;
        }
        
        return ans;
    }
}