class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
       boolean bool[] = new boolean[1001];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                int j = i-k > 0 ? i-k : 0;
                for( ; j <= i+k && j < nums.length; j++) {
                    bool[j] = true;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 1001; i++) {
            if(bool[i]) {
                list.add(i);
            }
        }
        return list;
    }   
 }
