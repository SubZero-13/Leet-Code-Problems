class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int left[] = new int[n];
        int rigth[] = new int[n];
        int ans[] = new int[n];
        left[0] = 0;
        int count = boxes.charAt(0) - '0';
        for(int i = 1; i < boxes.length(); i++)
        {
            left[i] = left[i-1] + count;
            count += boxes.charAt(i) - '0';
        }
        rigth[n-1] = 0;
        count = boxes.charAt(n-1) - '0';
        for(int i = n-2; i >= 0; i--)
        {
            rigth[i] = rigth[i+1] + count;
            count += boxes.charAt(i) - '0';
        }
        for(int i = 0; i < boxes.length(); i++)
        {
            ans[i] = left[i] + rigth[i];
        }
        return ans;
    }
}