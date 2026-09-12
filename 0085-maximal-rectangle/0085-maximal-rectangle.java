class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length==0) return 0;
        int rows=matrix.length;
        int cols=matrix[0].length;

        int[] heights=new int[cols];
        int maxArea = 0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }else{
                    heights[j]=0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;

    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;

        for(int i=0;i<=heights.length;i++){
            int currentHeight=(i==heights.length?0:heights[i]);

            while(!stack.isEmpty() && heights[stack.peek()]>currentHeight){
                int currentBarIndex=stack.pop();
                int height=heights[currentBarIndex];
                int leftB=stack.isEmpty()?-1:stack.peek();
                int rightB=i;
                int width=rightB-leftB-1;
                maxArea=Math.max(maxArea,width*height);
            }
            if(i<heights.length){
                stack.push(i);
            }
        }
        return maxArea;
    }
}