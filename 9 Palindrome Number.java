class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0, sum = 0;
        int temp;
        temp = x;
        if(temp < 0)
        {
            return false;
        }
        while(temp > 0)
        {
            rem = temp % 10;
            sum = (sum*10) + rem;
            temp = temp/10;
        }
        if(sum == x)
        {
            return true;
        }
        else{
            return false;
        }
    }
}