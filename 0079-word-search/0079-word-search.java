class Solution {
    static boolean helper(char[][] board,int x,int y,int idx,char w[]){
        

        if(idx == w.length) return true;
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return false;
        }
        
        if (board[x][y] != w[idx]) return false;
            board[x][y] = '#';

        
        // down
        if(helper(board,x+1,y,idx+1,w)){
            board[x][y] = w[idx];
            return true;
        }
        // up
        if(helper(board,x-1,y,idx+1,w)){
            board[x][y] = w[idx];
            return true;
        }
        // left
        if(helper(board,x,y-1,idx+1,w)){
            board[x][y] = w[idx];
            return true;
        }
        //right
        if(helper(board,x,y+1,idx+1,w)){
            board[x][y] = w[idx];
            return true;
        }
    board[x][y] = w[idx];
    return false;

    }
    public boolean exist(char[][] board, String word) {
        
        char w[] = word.toCharArray();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == w[0] && helper(board,i,j,0,w)){
                    return true;
                }
            }
        }

       return false;
    }
}