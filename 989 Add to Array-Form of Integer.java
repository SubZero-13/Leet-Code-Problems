class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length-1;
        List<Integer> ans = new ArrayList<>();
        while(len >= 0 || k != 0) {
            if(len >= 0) {
                k += num[len--];
            }
            ans.add(0, k%10);
            k /= 10;
        }
        return ans;
    }
}