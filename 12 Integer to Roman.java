class Solution {
    public String intToRoman(int num) {
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int [] a = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int idx = a.length-1;
        String ans = "";
        while(num > 0)
        {
            while(a[idx] <= num)
            {
                ans = ans + romans[idx];
                num = num-a[idx];
            }
            idx--;
        }
        return ans;
    }
}