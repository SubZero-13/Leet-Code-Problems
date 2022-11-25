class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        int len  = arr.length;
        int leftMin[] = new int[len];
        Arrays.fill(leftMin, -1);
        int rightMin[] = new int[len];
        Arrays.fill(rightMin, len);
        Stack<Integer> s = new Stack<>();
        for(int i = len-1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] > arr[i]) {
                int idx = s.pop();
                leftMin[idx] = i;
            }
            s.push(i);
        }
        s.clear();
        for(int i = 0; i < len; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int idx = s.pop();
                rightMin[idx] = i;
            }
            s.push(i);
        }
        long res = 0;
        for(int i = 0; i < len; i++) {
            int leftLen = i -leftMin[i];
            int rightLen  = rightMin[i] - i;
            res = (res + ((long)arr[i]*leftLen*rightLen)%mod)%mod;
        }
        return (int)res;
    }
}