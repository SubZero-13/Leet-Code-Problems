// Understand Through Example:
// 4, 3, 2, 6
// step 1: 0*4 + 1*3 + 2*2 + 3*6
// step 2: 0*6 + 1*4 + 2*3 + 3*2
//         = 1*4 + 2*3 + 3*2 + 0*6
//         = (0*4 + 4) + (1*3 + 3) + (2*2 + 2) + (3*6-3*6)
//         = (0*4 + 1*3 + 2*2 + 3*6) + (4 + 3 + 2) - (3*6)
//         = (step1) + (4+3+2+6) - (4*6)
//         = step1 + totalSum - len*arr[i];

// step 3: step2 + totalSum - len*arr[i]
//         (prevStep) + sum - len*arr[i]

class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0, n = nums.length;
        int prevSum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            prevSum += (i*nums[i]);
        }
        int max = prevSum;
        for(int i = n-1; i >= 0; i--) {
            prevSum = prevSum + sum - (n*nums[i]);
            max = Math.max(prevSum, max);
        }
        return max;
    }
}