class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // window length = right-left+1
        int currentSum=0;
        int minLen=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<=nums.length-1;right++){
            currentSum+=nums[right];
            while(currentSum>=target){
                minLen=Math.min(minLen,right-left+1);
                currentSum-=nums[left];
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}