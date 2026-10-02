class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // isme apan matrix[i][0] ka start and end 
        int start = 0;
        int end = (rows*cols)-1;

        while (start <= end) {
            int mid = (end - start) / 2 + start;
            int row=mid/cols;
            int col=mid%cols;
            int val=matrix[row][col];

            if(val==target){
                return true;
            }
            else if(val<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}