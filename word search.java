class Solution {
     public static boolean solve(char[][] board, int row, int col, int idx, String word){
        if (idx == word.length()){
            return true;
        }

        int[] r = {0, 1, 0, -1};
        int[] c = {1, 0, -1, 0};

        if(row<0 || col<0 || row>=board.length || col>= board[0].length || board[row][col] != word.charAt(idx)){
            return false;
        }

        boolean flag = false;

        for (int i = 0; i < c.length; i++) {
            char ch = board[row][col];
            board[row][col] = '*';
            flag = solve(board, row+r[i], col + c[i], idx+1, word);
            if(flag){
                return flag;
            }
            board[row][col] = ch;
        }
        return flag;
    }
    public static boolean exist(char[][] board, String word){
        boolean flag = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0]. length; j++) {
                if(board[i][j] == word.charAt(0)){
                    flag = solve(board, i, j, 0, word);
                    if (flag){
                        return flag;
                    }
                }
            }
        }
        return flag;
    }
}