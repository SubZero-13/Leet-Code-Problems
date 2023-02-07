class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length <= 2) {
            return fruits.length;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int j = 0;
        for(int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            while(map.size() > 2) {
                map.put(fruits[j], map.get(fruits[j])-1);
                if(map.get(fruits[j]) == 0) {
                    map.remove(fruits[j]);
                }
                j++;
            }
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}