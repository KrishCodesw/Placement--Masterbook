class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> stack= new Stack<>();

        int area=0;

       for(int i=0;i<=heights.length;i++){

        if(i==heights.length){
            int currentBarIndex=0;
        }
        
        int currHeight = (i == heights.length) ? 0 : heights[i];

        while(!stack.isEmpty() && heights[stack.peek()]>currHeight){
            int currentBarIndex=stack.pop();
            int height=heights[currentBarIndex];
            int leftB= stack.isEmpty() ? -1 : stack.peek();
            int rightB=i;
            int width=rightB-leftB-1;

            // height of the largest rectangle- heights[currentBarIndex]
            // left boundary of the largest rectangle- stack.peek()
            // right boundary of the largest rectangle- i
            // width of the largest rectangle- right-left-1
            area=Math.max(area,width*height);
        }
        if(i<heights.length){
        stack.push(i);
        }
        
       } 
       return area;
    }
}