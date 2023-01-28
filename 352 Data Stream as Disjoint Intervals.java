class SummaryRanges {
    TreeSet<Integer> nums;
    SummaryRanges() {
        nums = new TreeSet<>();
    }
    
    void addNum(int value) {
        nums.add(value);
    }
    
    int[][] getIntervals() {
        List<int[]> intervals = new ArrayList<>();
        int start = nums.first();
        int end = nums.first();
        for (Integer val : nums.tailSet(nums.first()+1)) {
        if (val - end == 1) {
        end = val;
        } else {
        intervals.add(new int[]{start, end});
        start = end = val;
        }
        }
        intervals.add(new int[]{start, end});
        int[][] ans = intervals.toArray(new int[intervals.size()][2]);
        return ans;
    }
}
