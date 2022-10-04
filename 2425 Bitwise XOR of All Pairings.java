class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x = 0, y = 0;
        for(int a: nums1) {
            x ^= a;
        }
        for(int b: nums2) {
            y ^= b;
        }
        
        return (nums1.length%2 * y) ^ (nums2.length%2*x);
    }
}