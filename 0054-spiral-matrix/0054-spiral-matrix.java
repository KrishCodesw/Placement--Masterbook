class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return list;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int top=0;
        int left=0;
        int right =matrix[0].length-1;
        int bottom=matrix.length-1;

        while(top<=bottom && left<=right){
            // going from top left to top right 
            for(int col=left;col<=right;col++){
                list.add(matrix[top][col]);
            }
            top++;

            // going from top right to bottom right 
            for(int row=top; row<=bottom;row++){
                list.add(matrix[row][right]);
            }
            right--;

            // going from bottom right to bottom left 
            if(top<=bottom){
                for(int col=right;col>=left;col--){
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }
            if(left<=right){
                for(int row=bottom;row>=top;row--){
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }
        return list;
    }
}