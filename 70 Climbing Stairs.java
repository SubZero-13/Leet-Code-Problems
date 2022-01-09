class Solution {
    public int climbStairs(int n) {
        int count = 1;
		for (int i = 1; i <= n / 2; i++) {
		count += calculateFactorial(n - (i * 2)+1, n - (i * 2) + i) / calculateFactorial(1, i);
		}      
        return count;
	}

	public static double calculateFactorial(int startNum, int endNum) {
	
		double factorial = 1;
		for (int i = startNum; i <= endNum; i++)
			factorial *= i;
		return factorial;
    }
}