class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length == 0) {
            return "";
        }
        int n = nums.length;
        String sNums[] = new String[n];
        for(int i = 0; i < n; i++) {
            sNums[i] = String.valueOf(nums[i]);
        }
        
        Comparator<String> comp = new Comparator<>() {
            @Override
            public int compare(String str1, String str2) {
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(sNums, comp);
        if(sNums[0].charAt(0) == '0') {
            return "0";
        }
        
        String ans = "";
        for(int i = 0; i < n; i++) {
            ans += sNums[i];
        }
        return ans;
    }
}