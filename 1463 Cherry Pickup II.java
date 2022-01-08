class Solution {
        int dp[][][];
    public int cherryPickup(int[][] grid) {
        dp=new int[grid.length][grid[0].length][grid[0].length];
        for(int t[][]:dp) for(int k[]:t) Arrays.fill(k,-1);
        return result(grid,0,0,grid[0].length-1);
    }
    
    int result(int grid[][],int i,int j,int k){
        if(i>=grid.length||j<0||k<0||j>=grid[0].length || k>=grid[0].length) return 0;
        
        if(dp[i][j][k]!=-1) return dp[i][j][k];
        
        int res=0;
        res+=grid[i][j];
        if(j!=k)
            res+=grid[i][k];
        
        
        int max=0;
       
        for(int col1=j-1;col1<=j+1;col1++){
            for(int col2=k-1;col2<=k+1;col2++){
                max=Math.max(result(grid,i+1,col1,col2),max);
            }
        }
        return dp[i][j][k]=max+res;
    }
}