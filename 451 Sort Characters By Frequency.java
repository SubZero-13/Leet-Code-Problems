class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Character>[] buck = new List[s.length()+1];
        for(char key: map.keySet()) {
            int freq = map.get(key);
            if(buck[freq] == null) buck[freq] = new ArrayList<Character>();
            buck[freq].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = buck.length-1; i >= 0; i--) {
            if(buck[i] != null) {
                for(char c: buck[i]) {
                    for(int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}