class MyCalendarThree {
    TreeMap<Integer, Integer> map;
    public MyCalendarThree() {
        map = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        int ans = 0;
        int currBook = 0;
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        for(int v: map.values()) {
           ans = Math.max(ans, currBook+=v);
        }
        return ans;
    }
}