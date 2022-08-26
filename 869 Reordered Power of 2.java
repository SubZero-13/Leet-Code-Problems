class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] countN = counter(n);
        int num = 1;
        for(int i = 0; i < 31; i++) {
            if(Arrays.equals(countN, counter(num))) {
                return true;
            }
            num = num << 1;
        }
        return false;
    }
    
    private int[] counter(int n) {
        int arr[] = new int[10];
        while(n > 0) {
            arr[n%10]++;
            n = n/10;
        }
        return arr;
    }
}