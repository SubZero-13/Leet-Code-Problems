class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        TreeMap<String, List<String>> map = new TreeMap<>();
        TreeMap<String, Integer> freq = new TreeMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < paths.length; i++) {
            String files[] = paths[i].split(" ");
            for(int j = 1; j < files.length; j++) {
                String w[] = files[j].split("\\(");
                int len = w[1].length();
                String str = w[1].substring(0, len-1);
                freq.put(str, freq.getOrDefault(str, 0) + 1);
                if(map.containsKey(str)) {
                    List<String> list = map.get(str);
                    String s = files[0] + "/" + w[0];
                    list.add(s);
                    map.put(str, list);
                }
                else {
                    List<String> list = new ArrayList<>();
                    String s = files[0] + "/" + w[0];
                    list.add(s);
                    map.put(str, list);
                }
            }
        }
        for(String key: map.keySet()) {
            if(freq.get(key) > 1) {
                ans.add(map.get(key));
            }
        }
        return ans;
    }
}