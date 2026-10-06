class Solution {
    public void gameOfLife(int[][] board) {
        int rows=board.length;
        int cols=board[0].length;

        int [][] directions ={
            {-1,-1},{-1,0},{-1,1},
             {0,-1},      {0,1},
             {1,-1},{1,0},{1,1}
        };

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int liveNeighbors=0;
                for (int[] dir : directions) {
                    int x=i+dir[0];
                    int y=j+dir[1];

                    if(x>=0 && x<rows && y>=0 && y<cols){
                        if(board[x][y]==1 || board[x][y]==2){
                            liveNeighbors++;
                        }
                    }
                }
                if(board[i][j]==1 && (liveNeighbors<2 ||liveNeighbors>3 )){
                    board[i][j]=2;
                }
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 3; 
                }

            }
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 2) board[r][c] = 0;
                if (board[r][c] == 3) board[r][c] = 1;
            }
        }
    }
}