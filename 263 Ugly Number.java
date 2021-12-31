class Solution {
    public boolean isUgly(int n) {
        if(n <= 0)
            return false;
        int arr[] = {2,3,5};
        for(int x: arr)
        {
            while(n%x==0)
                n = n / x;
        }
        if(n == 1)
        {
            return true;
        }
        return false;
    }
}