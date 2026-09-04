class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCounter=0;
        int left=0;
        int maxLength=0;
        for(int right=0; right<nums.length;right++){
            if(nums[right]==0){
                zeroCounter++;
            }
            while(zeroCounter>k){
                if(nums[left]==0){
                    zeroCounter--;
                }
                left++;
            }
                maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
}