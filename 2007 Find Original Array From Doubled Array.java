class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n =  changed.length;
        if(n%2 != 0) {
            return new int[] {};
        }
        int ans[] = new int[n/2];
        int freq[] = new int[100001];
        for(int a: changed) {
            freq[a]++;
        }
        int j = 0;
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0 && i*2 < 100001 && freq[i*2] > 0) {
                freq[i]--;
                freq[i*2]--;
                if(freq[i*2] < 0) {
                    return new int[] {};
                }
                ans[j++] = i;
            }
        }
        for(int i = 0; i < freq.length  ; i++) {
            if(freq[i] != 0) {
                return new int[] {};
            }
        }
        return ans;
    }
}