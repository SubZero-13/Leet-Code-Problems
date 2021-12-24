class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - counter > 0) {
                result.add(counter++);
            }
            if (nums[i] == counter) counter++;
        }
        while (counter <= nums.length) {
            result.add(counter++);
        }
        return result;
    }
}