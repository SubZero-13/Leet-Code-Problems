
0/5
class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length, j, k;
        Stack<Integer> s = new Stack<>();
        long res = 0;
        for(int i = 0; i <= n; i++) {
            int currVal = i == n ? Integer.MIN_VALUE : nums[i]; 
            while(!s.isEmpty() && nums[s.peek()] > currVal) {
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res -= (long)nums[j]*(i-j)*(j-k);
            }
            s.push(i);
        }
        s.clear();
        for(int i = 0; i <= n; i++) {
            int currVal = (i >= n ? Integer.MAX_VALUE : nums[i]); 
            while(!s.isEmpty() && nums[s.peek()] < currVal) {
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res += (long)nums[j]*(i-j)*(j-k);
            }
            s.push(i);
        }
        return res;
        
    }
}