class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        if(n == 1) {
            res.add(n);
        }
        for(int i = 1; i <=9; i++) {
            dfs(i, n-1, k, res);
        }
        
        return res.stream().mapToInt(j->j).toArray();
    }
    public void dfs(int num, int n, int k, List<Integer> res) {
        if(n==0) {
            res.add(num);
            return;
        }
        int digit = num % 10;
        if(digit >= k) {
            dfs(num*10+digit-k, n-1, k, res);
        }
        if(k > 0 && k+digit <= 9) {
            dfs(num*10 + digit + k, n-1, k, res);
        }
    }
}