class Solution {
    public int[] twoSum(int[] numbers, int target) {
          if (numbers == null || numbers.length < 2) {
            return new int[0];
        }
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[] {low + 1, high + 1};
            } else if (sum > target) { 
                high--;
            } else {
                low++;
            }
        }
        
        return new int[0];
    }
}