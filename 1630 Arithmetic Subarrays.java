class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int m = l.length;
        for(int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = l[i]; j <= r[i]; j++) {
                list.add(nums[j]);
            }
            Collections.sort(list);
            int diff = list.get(1) - list.get(0);
            boolean flag = false;
            for(int k = 2; k < list.size(); k++) {
                if(list.get(k)-list.get(k-1) != diff) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                ans.add(false);
            }
            else {
                ans.add(true);
            }
        }
        return ans;
    }
}