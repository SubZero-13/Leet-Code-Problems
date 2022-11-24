class Solution {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
       for(int i = 0; i < board.length; i++) {
           for(int j = 0; j < board[i].length; j++) {
               if(exist(i, j, board, w, 0)) return true;
           }
       }
       return false;
    }
    public boolean exist(int i, int j, char[][] mat, char[] w, int idx) {
       if(idx >= w.length) return true;
       if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length) return false;
       if(w[idx] != mat[i][j]) return false;
       char ch = mat[i][j];
       mat[i][j] = '.';
       boolean present = exist(i-1, j, mat, w, idx+1) || exist(i+1, j, mat, w, idx+1)
                            || exist(i, j-1, mat, w, idx+1) || exist(i , j+1, mat, w, idx+1);
        
        mat[i][j] = ch;
        return present;
    }
}