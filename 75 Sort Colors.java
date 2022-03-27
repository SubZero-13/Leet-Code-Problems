class Solution {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                countZero++;
            }
            else if(nums[i] == 1) {
                countOne++;
            }
            else if(nums[i] == 2) {
                countTwo++;
            }
        }
        int j = 0;
        while(countZero > 0) {
            nums[j] = 0;
            j++;
            countZero--;
        }
         while(countOne > 0) {
            nums[j] = 1;
            j++;
             countOne--;
        }
         while(countTwo > 0) {
            nums[j] = 2;
            j++;
            countTwo--;
        }
    }
}