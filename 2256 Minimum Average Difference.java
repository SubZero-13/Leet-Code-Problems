class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for(int a: nums) {
            sum += a;
        }
        long min = (sum/n);
        int res = (n-1);
        long firstSum = 0;
        for(int i = 0; i < nums.length-1; i++) {
            firstSum += nums[i];
            long avg1 = (firstSum/(i+1));
            long avg2 = ((sum-firstSum)/(n-i-1));
            long diff = Math.abs(avg1-avg2);

            if(min == diff) {
                res = Math.min(res, i);
            }
            if(min > diff) {
                min = diff;
                res = i;
            }
        }
        System.out.print(res);
        return res;
    }
}