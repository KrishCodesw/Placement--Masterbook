class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int width=right-left;
            int height1=Math.min(height[left],height[right]);
            int currentArea = width * height1;
            maxArea = Math.max(maxArea, currentArea);

            if(height[left]<height[right]){
                left++;
            }else if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }

        }
        return maxArea;
    }
}