class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        int waterTrapped=0;
        while (left < right) {
            if (maxLeft < maxRight) {
            waterTrapped   += maxLeft - height[left];
            left++;
            if(height[left]>maxLeft){
                maxLeft=height[left];
            }
            }else{
                waterTrapped+=maxRight-height[right];
                right--;
                if(height[right]>maxRight){
                    maxRight=height[right];
                }
            }

        }
        return waterTrapped;
    }
}