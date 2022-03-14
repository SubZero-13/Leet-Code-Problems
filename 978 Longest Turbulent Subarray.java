class Solution {
    public int maxTurbulenceSize(int[] arr) {
        boolean gflag = false;
        boolean sflag = false;
        int len = 0; 
        int count = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                if(gflag) {
                    len = Math.max(len, count);
                    count = 1;
                }
                else {
                    gflag = true;
                    sflag = false;
                    count++;
                    len = Math.max(len, count);
                }
            }
            else if(arr[i] < arr[i+1]) {
                if(sflag) {
                    len = Math.max(len, count);
                    count = 1;
                }
                else {
                    sflag = true;
                    gflag = false;
                    count++;
                    len = Math.max(len, count);
                }
            }
            else {
                gflag = false;
                sflag = false;
                len = Math.max(len, count);
                count = 0;
            }
        }
        return len+1;
    }
}