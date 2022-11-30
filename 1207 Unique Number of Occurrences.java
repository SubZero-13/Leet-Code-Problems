class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
}