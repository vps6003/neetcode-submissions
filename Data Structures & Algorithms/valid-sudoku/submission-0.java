class Solution {
    public boolean isValidSudoku(char[][] board) {
        return helper(board);
    }

    private boolean helper(char[][] board){
        if(
            !gridCheck(board) || 
            !rowCheck(board)  ||
            !colCheck(board)
          ) return false;

        return true;
    }

    private boolean rowCheck(char[][] board){
        for(int i = 0; i<9;i++){
            int[] map = new int[10];
            Arrays.fill(map,0);

            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;


            if(map[board[i][j] - '0'] != 0) return false;
            map[board[i][j]-'0']++; 
            }
        }
        return true;
    }

    private boolean colCheck(char[][] board){
        for(int i = 0; i<9;i++){
            int[] map = new int[10];
            Arrays.fill(map,0);

            for(int j=0;j<9;j++){
                if(board[j][i] == '.') continue;

            if(map[board[j][i] - '0'] != 0) return false;
            map[board[j][i]-'0']++; 
            }
        }
        return true;
    }

    private boolean gridCheck(char[][] board){
        for(int i = 0; i<6;i += 3){
            for(int j = 0 ; j<6; j += 3){
            int[] map = new int[10];
            Arrays.fill(map,0);


                int x = i;
                for(;x<i+3 && i<=6;x++){
                int y = j;
                    for(;y<j+3 && j<=6;y++){
                if(board[x][y] == '.') continue;

                        if(map[board[x][y] - '0'] != 0){
                            return false;
                        } 
                        map[board[x][y] - '0']++;
                    }
                }
            }
        }
        return true;
    }
}
