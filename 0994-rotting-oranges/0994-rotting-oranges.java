class Solution {
    public int orangesRotting(int[][] grid) {

        if(grid==null|| grid.length==0) return -1;

        int rows=grid.length;
        int cols=grid[0].length;

        int freshCount=0; 

        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i, j});
                }else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }
        if(freshCount==0) return 0;

        int minutes=0;

        int [][] directions={{0,1},{1,0},{-1,0},{0,-1}};

        while(!queue.isEmpty() && freshCount>0){
            int size=queue.size();
            minutes++;
            for(int k=0;k<size;k++){
                int[] rotten=queue.poll();
                for(int [] dir:directions){
                    int x= rotten[0]+ dir[0];
                    int y= rotten[1]+ dir[1];

                    if(x>=0 && x<rows && y>=0 && y<cols && grid[x][y]==1){
                        grid[x][y]=2;
                        freshCount--;
                        queue.offer(new int[]{x,y});
                    }
                }
                


            }
        }
        return freshCount==0?minutes:-1;
    }
}